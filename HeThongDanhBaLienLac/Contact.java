package HeThongDanhBaLienLac;

import java.util.Scanner;

public abstract class Contact {
	private String name;
	private String sdt;
	private String email;
	
	// constructor
	public Contact() {}
	public Contact(String name, String sdt, String email) {
		this.name = name;
		this.sdt = sdt;
		this.email = email;
	}
	
	// nhap tt
	public void nhapTT(Scanner input) {
		System.err.print("Nhap ten: ");
		name = input.nextLine();
		System.out.print("Nhap so dien thoai: ");
		sdt = input.nextLine();
		System.out.print("Nhap dia chi email: ");
		email = input.nextLine();
	}
	
	// getter
	public String getName() {return name;}
	public String getSdt() {return sdt;}
	public String getEmail() {return email;}
	
	//setter
	public void setName(String name) {
		this.name = name.trim().substring(0,1).toUpperCase() + name.trim().substring(1).toLowerCase();
	}
	
	public void setSdt(String sdt) {
		if (sdt.matches("[0-9]+") && (sdt.length() == 10)) {
			this.sdt = sdt;
		}
	}
	
	public void setEmail(String email) {
		if (email.contains("@") && email.endsWith(".com")) {
			this.email = email;
		}
	}
	
	@Override
	public String toString () {
		return "|Ten: "+name+
				"|SDT: "+sdt+
				"Email: "+email;
	}
}
