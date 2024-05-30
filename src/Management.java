import java.io.*;
import java.util.ArrayList;
import models.Staff;

public class Management {
	private ArrayList<Staff> staffs;

	public Management() {
		this.staffs = new ArrayList<>();
	}

	public void addStaff(Staff staff) {
		staffs.add(staff);
	}

	public ArrayList<Staff> getStaffs() {
		return staffs;
	}

	public Staff searchStaffById(String id) {
		for (Staff staff : staffs) {
			if (staff.getId().equals(id)) {
				return staff;
			}
		}
		return null;
	}

	public void deleteStaffById(String id) {
		staffs.removeIf(staff -> staff.getId().equals(id)); // ham removeIf
	}

	public ArrayList<Staff> searchStaffByName(String name) {
		ArrayList<Staff> result = new ArrayList<>();
		for (Staff staff : staffs) {
			if (staff.getName().equalsIgnoreCase(name)) {
				result.add(staff);
			}
		}
		return result;
	}

	public void saveToFile(String filename) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(staffs);
			fos.close();
			oos.close();
		} catch (IOException e) {
			System.out.println("Can not save to file");
		}
	}

	public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(filename); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			staffs = (ArrayList<Staff>) ois.readObject();
			fis.close();
			ois.close();
		}catch(IOException e) {
			System.out.println("Can not load from file");
		}
	}
}
