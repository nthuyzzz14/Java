package qlsanpham;

import java.util.Scanner;
public class SanPhamNhapKhau extends SanPham{
	private double thueNhapKhau;
	
	public SanPhamNhapKhau() {};
	public SanPhamNhapKhau(String maSP,String tenSP,double donGia,double thueNhapKhau) {
		super(maSP,tenSP,donGia);
		this.thueNhapKhau = thueNhapKhau;
	}
	
	public double getthueNhapKhau() {return thueNhapKhau;}
	public void setthueNhapKhau(double thueNhapKhau) {this.thueNhapKhau = thueNhapKhau;}
	
	public void nhapTT(Scanner input) {
		super.nhapTT(input);
		
		while(true) {
			try {
				System.out.print("Nhap thue san pham nhap khau: ");
				thueNhapKhau = input.nextDouble();
				input.nextLine();
				
				if(thueNhapKhau <= 0) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("LOI: Sai kieu du lieu !");
			}
		}
	}
	
	@Override 
	public String toString() {
		return super.toString()+
				"\n|Thue nhap khau: "+thueNhapKhau;
	}
	
	@Override
	public double tinhGiaBan() {
		return donGia + thueNhapKhau;
	}
	
}
