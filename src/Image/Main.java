package Image;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;

import java.io.*;
import java.net.URL;

import java.io.*;
import java.net.URL;

public class Main {
	public static void main(String[] args) {
		try {
			// Using relative paths
			FileReader fileReader = new FileReader("src/list-img.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
			int imageCounter = 1; // To create unique file names
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				String imagePath = line;
				URL url = new URL(imagePath);
				BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
				FileOutputStream fileOutputStream = new FileOutputStream("src/img/anh" + imageCounter + ".jpg");
				int i;
				while ((i = bufferedInputStream.read()) != -1) {
					fileOutputStream.write(i);
				}
				fileOutputStream.flush();
				bufferedInputStream.close();
				fileOutputStream.close();
				imageCounter++; 
			}
			bufferedReader.close(); 
		} catch (Exception e) {
			e.printStackTrace(); 
			System.out.println("An error occurred!");
		}
	}
}
