package quanlythucung;

import java.util.InputMismatchException;
public class meo extends pet{
	private String origin;
	
	//contructor
	public meo(String name, int age, String color, String origin) {
		super(name,age,color);
		this.origin = origin;
	}
	
	//getter and setter
	public String getorigin() { return origin;}
	public void setorigin(String origin) {
		try {
			this.origin = origin;
		} catch (InputMismatchException ime) {
			System.out.println("Nguon goc phai duoc ghi bang chu cai !");
		}
	}
	
	// abstract class
	@Override
	public String sound() {
		return "Mew mew !";
	}
	
	//hien thi them thong tin
	@Override
	public String toString() {
		return getTT() + String.format("| Nguon goc: %s",origin);
	}
}
