package QuanLySinhViencau1;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		ArrayList <SinhVien> dsSV = new ArrayList<>();
		
		int n;
		do {
			System.out.print("Nhap danh sach sinh vien (2 - 100): ");
			n = nhap.nextInt();
			nhap.nextLine();
			if (n < 2 || n > 100) {
				System.out.println("==>> Loi: Danh sach sinh vien phai nam trong khoang (2 - 100) !");
			}
		} while (n < 2 || n > 100);
		
		// nhap toan bo danh sach cho tung sinh vien theo thu tu
		for (int i = 1; i <= n; i++) {
			System.out.println("\n____________ NHAP THONG TIN CHO SINH VIEN THU "+i+" __________");
			SinhVien sv = new SinhVien();
			sv.nhapTT(nhap);
			dsSV.add(sv);
		}
		
		// hien thi danh sach sinh vien
		System.out.println("\n____________ DANH SACH SINH VIEN ____________");
		for(SinhVien sv : dsSV) {
			System.out.println(sv);
			sv.xepLoai();
		}
		
		//thuat toan tim sinh vien diem cao nhat 
		SinhVien max = dsSV.get(0);
		for(SinhVien sv : dsSV){
			if(sv.getdiemTB() > max.getdiemTB())
				max = sv;
		}

		System.out.println("\n__________ SINH VIEN CO DIEM CAO NHAT __________");
		System.out.println(max);
	}
}
