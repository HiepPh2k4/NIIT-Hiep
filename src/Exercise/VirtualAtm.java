package Exercise;

import java.util.Scanner;

public class VirtualAtm {
	private int id;
	private String name;
	private String password;
	private Float money;
	
	public VirtualAtm(int id, String name, String password, Float money) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.money = money;
	}

	Scanner s1 = new Scanner(System.in);
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String getPassword() {
		return password;
	}

	public float getMoney() {
		return money;
	}

	
    public void withdraw(float amount) {
        if (money >= amount) {
            money -= amount;
            System.out.println("Withdrew: " + amount + "$");
            System.out.println("Change: " + this.money);
        }
    }
	
	
}
