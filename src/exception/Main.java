package exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		try {
		System.out.println("thuong hai so la: " + (a/b));
		}catch(Exception e) {
			System.out.println("Loi chia cho 0, vui long nhap va");
		}
		System.out.println("tong hai so la: " + (a+b));
		sc.close();
	}

}
