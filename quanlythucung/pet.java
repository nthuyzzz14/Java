package quanlythucung;

import java.util.InputMismatchException;
public abstract class pet {
	private String name;
	private int age;
	private String color;
	private int tinhtuoi = 0;
	
	public pet(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//getter and setter
	public String getname() { return name;}
	public int getage() {return age; }
	public String getcolor() { return color;}
	
	public void setname(String name) {
		try {
			this.name = name;
		} catch (InputMismatchException ime) {
			System.out.println("Ten duoc nhap phai la chu cai !");
		}
	}
	public void setage(int age) {
		try {
			this.age = age;
			tinhtuoi = 100 /age;
		} catch (InputMismatchException ime) {
			System.out.println("Tuoi phai duoc nhap la so !");
		} catch (ArithmeticException ae) {
			System.out.println("Tuoi khac 0");
		}
	}
	public void setcolor(String color) {this.color =color;}
	
	// in ra thongtin
	public String getTT() {
		return String.format("| Ten: %s | Tuoi: %d | Mau long: %s", name, age, color);
	}
	
	// lop abstract
	public abstract String sound();
	
	//dinh dang in ra man hinh
	public String toString() {
		return getTT();
	}
}