package qlsanpham;

import java.util.Scanner;
import java.util.ArrayList;
public class main {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <SanPham> dsSP = new ArrayList<>();
		
		//kiem tra dau vao phia du nam trong khoang duoc quy dinh
		int n;
		do {
			System.out.print("Nhap so luong san pham (2 - 100): ");
			n = input.nextInt();
			input.nextLine();
			
			if(n < 2 || n > 100) {
				System.out.println("SO LUONG SAN PHAM PHAI NAM TRONG KHOANG 2 - 100 !!!");
			}
		} while (n < 2 || n > 100);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\n===== NHAP THONG TIN CHO SAN PHAM THU "+i+" =====");
			
			SanPham sp = new SanPham();
			sp.nhapTT(input);
			dsSP.add(sp);
		}
		
		//hien thi danh sach san pham sua khi nhap vao
		System.out.println("\n========== DANH SACH SAN PHAM ==========");
		for(SanPham sp : dsSP) {
			System.out.println(sp);
		}
		
		// tim sna pham gia cao nhat
		double spMax = dsSP.get(0).tinhGiaBan();
		for (SanPham sp : dsSP) {
			if (sp.tinhGiaBan() > spMax)
				spMax = sp.tinhGiaBan();
		}
		System.out.println("\nGia san pham cao nhat = "+spMax);
		
		//tinh gia ban
		for (SanPham sp : dsSP) {
			System.out.println("\nGia ban cua san pham "+sp.gettenSP()+" la: "+sp.tinhGiaBan());
		}
				
	}
}
