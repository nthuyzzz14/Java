package QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	private String maSp;
	private String tenSp;
	private double donGia;
	public ArrayList<SanPham> dsSP = new ArrayList<>();
	
	//contructor
	public SanPham() {}
	public SanPham(String maSp, String tenSp, double donGia) {
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.donGia = donGia;
	}
	
	//nhap tt
	public void nhapTT(Scanner input) {
		System.out.print("Nhap ma san pham: ");
		maSp = input.nextLine();
		input.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSp = input.nextLine();
		System.out.print("Nhap gia san pham: ");
		donGia = input.nextDouble();
	}
	
	//getter 
	public String getMaSP() {return maSp;}
	public String getTenSP() {return tenSp;}
	public double getdonGia() {return donGia;}
	
	//setter
	public void setMaSP(String maSp) {this.maSp = maSp;}
	public void setTenSP(String tenSp) {this.tenSp = tenSp;}
	public void setdonGia(double donGia) {this.donGia = donGia;}
	
	//hien thi thong tin
	@Override
	public String toString() {
		return "| Ma san pham: "+maSp+
				"| Ten san pham: "+tenSp+
				"| Gia san pham: "+donGia;
	}
	
	public void nhapDanhSach(Scanner input) {
		int n;
		while (true) {
			//vong lap dung de nhap so luong san pham 
			try {
				System.out.print("Nhap danh sach n san pham (2-100): ");
				n = input.nextInt();
				
				// neu vuot qua muc cho phep in ra thong bao thong bao va thoat vong lap
				if(n < 2 || n > 100) {
					throw new Exception("So luong san pham phai nam trong 2 - 100 !");
				}
				break;
			} catch (Exception e) {
				System.out.println("Loi: "+e.getMessage());
			}
		}
		
		// nhap thong tin cua san pham
		for (int i = 0; i < n; i++) {
			System.out.println("--------- NHAP THONG TIN CHO SAN PHAM "+(i+1)+" ---------");
			
			SanPham sp1 = new SanPham();
			
			// dung try-catch de bat lay nhung loi sia hi nhap du lieu de dam bao du lieu duoc nhap la dung
			try {
				sp1.nhapTT(input);
				dsSP.add(sp1);
			} catch (Exception e) {
				System.out.println("Loi nhap du lieu: "+e.getMessage());
				i--; // thuat toan tru di index i de nhap lai san pham neu du lieu sai 
			}
		}
	}
	
	//tim san pham gia cao nhatp
	public double tímpGiaMax(ArrayList<SanPham> dsSP) {
		double spMax = dsSP.get(0).getdonGia();
		
		for (int i = 1; i < dsSP.size(); i++) {
			if(dsSP.get(i).getdonGia() > spMax) {
				spMax = dsSP.get(i).getdonGia();
			}
		}
		return spMax;
	}
	
	//hien thi san pham gia cao nhat
	public void hienthiSPmax() {
		System.out.println("\n ======== San Pham Co Gia Cao Nhat ========");
		double spMaxCost = dsSP.get(0).getdonGia();
		
		for (SanPham sp1 : dsSP) {
			if (sp1.getdonGia() > spMaxCost) {
				spMaxCost = sp1.getdonGia();
			}
		}
		System.out.println("San pham co gia cao nhat  =  "+spMaxCost);
	}
	
}
