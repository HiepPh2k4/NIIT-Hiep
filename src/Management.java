import java.util.ArrayList;

import models.Student;

public class Management {

	ArrayList<Student> students = new ArrayList<>();

	public Management() {
		Student student1 = new Student("001", "Hiep", 20, 8.5f);
		Student student2 = new Student("002", "Quanganh", 21, 6.5f);
		Student student3 = new Student("003", "Duong", 22, 10f);
		Student student4 = new Student("004", "Dat", 23, 9.5f);
		Student student5 = new Student("005", "Tung", 24, 5.5f);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

	}

	public Student studentInf(String id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}
	
	public Student maxMark() {
		Student maxMark = students.get(0);
		for (Student student : students) {
			if (student.getMark() > maxMark.getMark()) {
				maxMark = student;
			}
		}
		return maxMark;
	}
	
	public Student minMark() {
		Student minMark = students.get(0);
		for (Student student : students) {
			if (student.getMark() < minMark.getMark()) {
				minMark = student;
			}
		}
		return minMark;
	}

	public Student maxAge() {
		Student maxAge = students.get(0);
		for (Student student : students) {
			if (student.getAge() > maxAge.getAge()) {
				maxAge = student;
			}
		}
		return maxAge;
	}
}
