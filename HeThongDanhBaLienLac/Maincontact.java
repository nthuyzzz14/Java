package HeThongDanhBaLienLac;

import java.util.ArrayList;
import java.util.Scanner;
public class Maincontact {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <BusinessContact> danhbaCV = new ArrayList<>();
		ArrayList <Contact> danhBa = new ArrayList<>();
		
		
		System.out.println("---------------- THEM NGUOI VAO DANH BA -------------------");
		
		int n;
		
		while (true) {
			try {
				System.out.print("Nhap so luong nguoi them vao dan ba (1-20)");
				n = input.nextInt();
				
				if(n < 2 || n > 20) {
					System.out.println("So luong phai nam trong khong 1 - 20 !");
				}
				break;
			} catch(NumberFormatException e) {
				System.out.print("So luong duoc nhap phai la so nguyen !");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\n----- Nguoi thu "+ (i+1)+" them vao danh ba -----");
			Contact c1 = new Contact("thuy","009231881724","masdmansdb@gmail.com");
			
			while(true) {
				c1.nhapTT(input);
				if(c1.getName().matches("[a-zA-Z\\s]+")) {
					throw new Exception("Ten duoc nhap phai la chu cai !");
				}
				danhBa.add(c1);
			}
		}
	}
}
