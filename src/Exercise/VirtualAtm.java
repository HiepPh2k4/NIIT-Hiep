package Exercise;

import java.util.Scanner;

public class VirtualAtm {
	private int Id;
	private String Name;
	private String Password;
	private Float Money;
	
	public VirtualAtm(int Id, String Name, String Password, Float Money) {
		this.Id = Id;
		this.Name = Name;
		this.Password = Password;
		this.Money = Money;
	}
	
	public VirtualAtm(String Name, String Password) {
		this.Name = Name;
		this.Password = Password;
	}

	Scanner s1 = new Scanner(System.in);
	
	public int getId() {
		return Id;
	}

	public void setId() {
		System.out.println("Input Id: ");
		Id = s1.nextInt();
	}

	public String getName() {
		return Name;
	}

	public void setName() {
		System.out.println("Input Name: ");
		Name = s1.nextLine();
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword() {
		System.out.println("Input Password: ");
		Password = s1.nextLine();
	}

	public float getMoney() {
		return Money;
	}

	public void setMoney() {
		System.out.println("Input Money: ");
		Money = s1.nextFloat();
	}
	
	
}
