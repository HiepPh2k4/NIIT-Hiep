import java.util.ArrayList;
import java.util.Scanner;
import models.Student;

public class Main {

	public static void main(String[] args) {
		Management management = new Management();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID: ");
		String id = scanner.nextLine();
		ArrayList<Student> stu = new ArrayList<>();
		while (management.studentInf(id) != null) {
			System.out.println("Login successful!!!");
			while (true) {
				System.out.println("Enter 1 -> 4: ");
				System.out.println("1. Show the Student's Information correspond with ID: ");
				System.out.println("2. Show the student with hightest GPA:  ");
				System.out.println("3. Show the student with lowest GPA:  ");
				System.out.println("4. Show the oldest student: ");
				System.out.println("5. Exit ");

				int input = scanner.nextInt();
				switch (input) {
				case 1:
					System.out.println("Student infomation: ");
					System.out.println("ID: " + management.studentInf(id).getId());
					System.out.println("Name: " + management.studentInf(id).getName());
					System.out.println("Age: " + management.studentInf(id).getAge());
					System.out.println("Gpa: " + management.studentInf(id).getMark());
					break;
				case 2:
					System.out.println("the student with highest GPA: ");
					System.out.println("ID: " + management.maxMark().getId());
					System.out.println("Name: "+ management.maxMark().getName());
					System.out.println("Age: "+ management.maxMark().getAge());
					System.out.println("Gpa: "+ management.maxMark().getMark());
					break;
				case 3:
					System.out.println("the student with lowest GPA: ");
					System.out.println("ID: " + management.minMark().getId());
					System.out.println("Name: "+ management.minMark().getName());
					System.out.println("Age: "+ management.minMark().getAge());
					System.out.println("Gpa: "+ management.minMark().getMark());
					break;
				case 4:
					System.out.println("the oldest student: ");
					System.out.println("ID: " + management.maxAge().getId());
					System.out.println("Name: "+ management.maxAge().getName());
					System.out.println("Age: "+ management.maxAge().getAge());
					System.out.println("Gpa: "+ management.maxAge().getMark());
					break;
				case 5:
					System.out.println("Au revoir!");
					return;
				}
			}
		}
	}

}
