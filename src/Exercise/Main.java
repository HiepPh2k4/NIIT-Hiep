package Exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of customer: ");
		int cus = sc.nextInt();
		VirtualAtm[] user = new VirtualAtm[cus];

		user[0] = new VirtualAtm(1, "Hiep", "123456", (float) 10000000);
		user[1] = new VirtualAtm(2, "Hiep 2", "123467", (float) 5000000);

		while (true) {
			System.out.println("Input 1 -> 3: ");
			System.out.println("1. Withdraw");
			System.out.println("2. Customer's Information");
			System.out.println("3. Exit");

			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter ID: ");
				int id = sc.nextInt();	
				System.out.println("Enter password: ");
				String pw = sc.nextLine();
				for (int i = 0; i < cus; i++) {
					if (id == user[i].getId() && pw == user[i].getPassword()) { 
						try {
							Scanner s = new Scanner(System.in);
							System.out.println("Input the amount of Money: ");
							float m = s.nextFloat();
							user[i].withdraw(m);
							break;
						}catch (Exception e) {
							System.out.println("Input the amount of Money again:");
						}
					}
				} 
				break;				
			case 2:
				System.out.println("Input the Id of Customer: ");
				int id2 = sc.nextInt();
				System.out.println("Information: ");
				System.out.println("Id: " + id2);
				for (int i = 0; i < cus; i++) {
					if (id2 == user[i].getId()) {
						System.out.println("Name: " + user[i].getName());
						System.out.println("Money: " + user[i].getMoney());
						System.out.println("-----------------");
					}
				}
				break;			
			case 3:
				System.out.println("gud bye , see you later");
				return;
			default:
				System.out.println("try again");
			}

		}
	}

}
