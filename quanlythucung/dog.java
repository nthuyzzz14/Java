package quanlythucung;

import java.util.InputMismatchException;
public class dog extends pet{
	private String breed;
	
	public dog(String name,int age, String color) {
		super(name,age,color);
		this.breed = breed;
	}
	
	//getter and setter
	public String getbreed() {return breed;}
	public void setbreed(String breed) {
		try {
			this.breed = breed;
		} catch (InputMismatchException ime) {
			System.out.println("Giong cho phai duoc ghi bang chu cai !");
		}
	}
	
	@Override
	public String sound() {
		return "Gaw gaw";
	}
	
	@Override
	public String toString() {
		return getTT() + String.format(" | Giong cho: ", breed);
	}
}
