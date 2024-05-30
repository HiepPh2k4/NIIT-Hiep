package models;
import java.io.Serializable;

public class Staff implements Serializable {
	private String id;
	private String name;
	private int age;
	private float salary;
	
		
	public Staff(String id, String name, int age, float salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
