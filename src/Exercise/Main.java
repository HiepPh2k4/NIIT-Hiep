package Exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of customer: ");
		int cus = sc.nextInt();
		VirtualAtm[] user = new VirtualAtm[cus];

		VirtualAtm user1 = new VirtualAtm("Hiep", "123456");
		VirtualAtm user2 = new VirtualAtm("Hiep 2", "234567");
		user[0] = user1;
		user[1] = user2;

		for (int i = 0; i < cus; i++) {
			System.out.print("Customer " + (i + 1) + ":\n");
			user[i].setId();
			user[i].setMoney();
		}

		System.out.println("Input 1 -> 3: ");
		System.out.println("1. Withdraw");
		System.out.println("2. Customer's Information");
		System.out.println("3. Exit");
		int input = sc.nextInt();
		switch (input) {
			case 1:
				while (true) {
					try {
						System.out.println("Input the amount of Money: ");
						float m = sc.nextFloat();
						System.out.println("Withdrew: " + m + "$");
						break;
					} catch (Exception e) {
						System.out.println("Input the amount of Money again:");
					}
				}
				break;
			case 2:
				System.out.println("Input the Id of Customer: ");
				int id = sc.nextInt();
				System.out.println("Information: ");
				System.out.println("Id: " + id);
				for (int i = 0; i < cus; i++) {
					System.out.println("Name: " + user[i].getName());
					System.out.println("Money: " + user[i].getMoney());
				}
				break;
			case 3:
				break;
		}

	}

}
