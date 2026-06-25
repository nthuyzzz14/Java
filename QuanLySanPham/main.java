package QuanLySanPham;

import java.util.Scanner;
public class main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		SanPham sp = new SanPham();
		
		sp.nhapDanhSach(input);
		
		sp.hienthiSPmax();
	}
}
