package QuanLyNhanVienCau2;

import java.util.ArrayList;
import java.util.Scanner;
public class main2 {
	public static void main(String [] args) {
		Scanner nhap = new Scanner(System.in);
		ArrayList<NhanVien> dsNV = new ArrayList<>();
		
		int n;
		//nhap so luong nhan vien 
		do {
			System.out.print("Nhap so luong nhan vien (2 - 100): ");
			n = nhap.nextInt();
			
			if(n < 2 || n > 100) {
				System.out.println("Loi: So luong nhan vien phai nam trong khoang 2 - 100 !");
			}
		}while (n < 2 || n > 100);
		
		//nhap thong tin cho tung nhan vien theo thu tu
		for (int i = 1; i <= n; i++) {
			System.out.println("\n ________ NHAP THONG TIN CHO NHAN VIEN THU "+i+" ________");
			//Khai bao them nhan vien
			NhanVien nv = new NhanVienKinhDoanh();
			nv.nhapTT(nhap);
			dsNV.add(nv);
		}
		
		//hien thi danh sach nhan vien 
		System.out.println("\n____________ DANH SACH NHAN VIEN ____________");
		for (NhanVien nv : dsNV) {
			System.out.println(nv);
		}
		
		//tinh nhanvien luong cao nhat
		double max = dsNV.get(0).getluongCB();
		for (NhanVien nv : dsNV) {
			if (nv.getluongCB() > max) {
				max = nv.getluongCB();
			}
		}
		System.out.println("\nNhan vien co thu nhap cao nhat = "+max);
		
		//sap xep giaam dan theo thu nhap
		double size = dsNV.size();
		for(int i =0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if(dsNV.get(j).thuNhap()  < dsNV.get(j+1).thuNhap()) {
					NhanVien temp = dsNV.get(j);
					dsNV.set(j, dsNV.get(j+1));
					dsNV.set(j+1, temp);
				}
			}
		}
		
		//sau khi viet thuat toan xong chi can goi obj
		System.out.println("\n___________ SAP XEP THU NHAP NHAN VIEN GIAM DAN ____________");
		for(NhanVien nv : dsNV) {
			System.out.println(nv);
		}
		
		
		nhap.close();
	}
}
