package qlsanpham;

import java.util.Scanner;
public abstract class SanPham {
	private String maSP;
	private String tenSP;
	protected double donGia;
	
	// 2 constructor
	public SanPham() {}
	
	public SanPham(String maSP, String tenSP, double donGia) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
	}
	
	//getter
	public String getmaSP() {return maSP;}
	public String gettenSP() {return tenSP;}
	public double getdonGia() {return donGia;}
	
	//setter
	public void setmaSP(String maSP) {this.maSP = maSP;}
	public void settenSP(String tenSP) {this.tenSP = tenSP;}
	public void setdonGia(double donGia) {this.donGia = donGia;}
	
	//nhap danh sach san pham
	public void nhapTT(Scanner input) {
		System.out.print("Nhap ma san pham: ");
		maSP = input.nextLine();
		
		// bat lay ngoaii le khi nhap s
		while(true) {
			try {
				System.out.print("Nhap ten san pham: ");
				tenSP = input.nextLine();
				if (tenSP.trim().isEmpty()) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("Ten san pham khong duoc bo trong !");
			}
		}
		
		//ngoai le khi nhap gia < 0
		while (true) {
			try {
				System.out.print("Nhap gia san pham: ");
				donGia = input.nextDouble();
				input.nextLine();
				if(donGia <= 0) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("Don gia san pham phai > 0 !");
			}
		}
	}
	
	//hienthi tt
	@Override
	public String toString() {
		return "|Ma san pham: "+maSP+
				"|Ten san pham: "+tenSP+
				"|Don gia: "+donGia;
	}
	
	//tinh gia ban 
	public abstract double tinhGiaBan();
}
