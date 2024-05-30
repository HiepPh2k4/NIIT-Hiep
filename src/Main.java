import models.Staff;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Management management = new Management();
	static Scanner sc = new Scanner(System.in);

	public static void saveData() {
		try {
			management.saveToFile("D:\\NIIT\\java\\Exercise\\StaffManagement\\src\\staff.dat");
		} catch (IOException e) {
			System.out.println("Error saving data.");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			management.loadFromFile("D:\\NIIT\\java\\Exercise\\StaffManagement\\src\\staff.dat");
		} catch (IOException e) {
			System.out.println("No previous data found, starting fresh.");
		}

		while (true) {
			String id;
			String name;
			int age;
			float salary;

			System.out.println("1. Add Staff");
			System.out.println("2. Update Staff by ID");
			System.out.println("3. Delete Staff by ID");
			System.out.println("4. Search Staff by Name");
			System.out.println("5. Display All Staff");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				id = sc.nextLine();
				System.out.print("Enter Name: ");
				name = sc.nextLine();
				System.out.print("Enter Age: ");
				age = sc.nextInt();
				System.out.print("Enter Salary: ");
				salary = sc.nextFloat();

				Staff staff = new Staff(id, name, age, salary);
				management.addStaff(staff);
				saveData();
				break;
			case 2:
				System.out.print("Enter ID of the staff to update: ");
				id = sc.nextLine();
				Staff upStaff = management.searchStaffById(id);

				if (management.searchStaffById(id) != null) {
					System.out.print("Enter new Name: ");
					name = sc.nextLine();
					System.out.print("Enter new Age: ");
					age = sc.nextInt();
					System.out.print("Enter new Salary: ");
					salary = sc.nextFloat();

					upStaff.setName(name);
					upStaff.setAge(age);
					upStaff.setSalary(salary);
					saveData();
				} else {
					System.out.println("Staff not found.");
				}
				break;
			case 3:
				System.out.print("Enter ID of the staff to delete: ");
				id = sc.nextLine();
				management.deleteStaffById(id);
				System.out.println("--Deleted ID--");
				saveData();
				break;
			case 4:
				System.out.print("Enter Name of the staff to search: ");
				name = sc.nextLine();
				ArrayList<Staff>result = management.searchStaffByName(name);

				if (!result.isEmpty()) {
					for (Staff searchStaff : result) {
						System.out.println("ID: " + searchStaff.getId());
						System.out.println("Name: " + searchStaff.getName());
						System.out.println("Age: " + searchStaff.getAge());
						System.out.println("Salary: " + searchStaff.getSalary());
						System.out.println("----------------------");
					}
				} else {
					System.out.println("No staff found with the given name.");
				}
				break;
			case 5:
				ArrayList<Staff> staffs = management.getStaffs();
				if (!staffs.isEmpty()) {
					for (Staff disStaff : staffs) {
						System.out.println("ID: " + disStaff.getId());
						System.out.println("Name: " + disStaff.getName());
						System.out.println("Age: " + disStaff.getAge());
						System.out.println("Salary: " + disStaff.getSalary());
						System.out.println("----------------------");
					}
				} else {
					System.out.println("No staff to display.");
				}
				break;
			case 6:
				saveData();
				System.out.println("Exiting program...");
				return;
			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}
}
