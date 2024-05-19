package exception;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		int a;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap a: ");
				a = sc.nextInt();
				System.out.println("So vua nhap la: " + a);
				break;
			} catch (Exception e) {
				System.out.println("vui long nhap lai: ");
			}
		}
	}

}
