package HeThongDanhBaLienLac;

import java.util.Scanner;

public class BusinessContact extends Contact{
	private String compName;
	private String web;
	
	public BusinessContact(String name,String sdt,String email,String compName, String web) {
		super(name,sdt,email);
		this.compName = compName;
		this.web = web;
	}
	
	public BusinessContact() {}
	
	public void nhapTT(Scanner input) {
		
		super.nhapTT(input);
		
		System.out.print("Nhap ten cong ty: ");
		compName = input.nextLine();
		System.out.print("Nhap ten webste: ");
		web = input.nextLine();
	}
	
	public String getcompName () {return compName;}
	public String getWeb () {return web;}
	
	public void setcompName(String compName) {
		if(compName == null || compName.trim().isEmpty())
			throw new IllegalArgumentException("Ten cong ty khong duoc bo trong !");
		this.compName = compName.trim();
	}
	public void setWeb(String web) {this.web = web;}
	
	@Override
	public String toString() {
		return super.toString()+
				"| Ten cong ty: "+compName+
				"| Website: "+web;
	}
}
