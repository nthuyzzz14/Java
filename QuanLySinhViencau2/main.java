package QuanLySinhViencau2;

import java.util.Scanner;
import java.util.ArrayList;
public class main {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		ArrayList <SinhVien> dsSV = new ArrayList<>();
		
		int n;
		do {
			System.out.print("Nhap danh sach sinh vien CNTT (2 - 100): ");
			n = nhap.nextInt();
			nhap.nextLine();
			if (n < 2 || n > 100) {
				System.out.println("==>> Loi: Danh sach sinh vien phai nam trong khoang (2 - 100) !");
			}
		} while (n < 2 || n > 100);
		
		// nhap toan bo danh sach cho tung sinh vien theo thu tu
		for (int i = 1; i <= n; i++) {
			System.out.println("\n____________ NHAP THONG TIN CHO SINH VIEN THU "+i+" __________");
			SinhVien sv = new SinhVienCNTT();
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
		double max = dsSV.get(0).getdiemTB();
		for (SinhVien sv : dsSV) {
			if(sv.getdiemTB() > max)
				max = sv.getdiemTB();
		}
		System.out.println("\nDiem trung binh cao nhat = "+max);
		
		//sap xep diem tong ket giam dan 
		double a = dsSV.size();
		for (int i = 0 ; i < a - 1; i++) {
			for(int j = 0; j < a - i - 1; j++) {
				if(dsSV.get(j).tinhDiemTK() < dsSV.get(j+1).tinhDiemTK()) {
					SinhVien temp = dsSV.get(j);
					dsSV.set(j, dsSV.get(j+1));
					dsSV.set(j+1, temp);
				}
			}
		}
		System.out.println("\n____________ SAP XEP DANH SACH SINH VIEN ____________");
		for(SinhVien sv : dsSV) {
			System.out.println(sv);
		}
	}
}
