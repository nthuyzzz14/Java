package QuanLyNhanVienCau2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class NhanVienKinhDoanh extends NhanVien{
	private double doanhSo;
	
	public NhanVienKinhDoanh() {}
	public NhanVienKinhDoanh(String maNV, String hoTen, double luongCB,double doanhSo) {
		super(maNV,hoTen,luongCB);
		this.doanhSo = doanhSo;
	}
	
	public double getdoanhSo() {return doanhSo;}
	public void setdoanhSo(double doanhSo) {this.doanhSo = doanhSo;}
	
	@Override
	public double thuNhap() {
		return luongCB + doanhSo * 0.1;
	}
	
	public void nhapTT(Scanner nhap) {
		super.nhapTT(nhap);
		
		while(true) {
			try {
				System.out.print("Nhap doanh so: ");
				doanhSo = nhap.nextDouble();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Loi: Du lieu khong hop le !");
			}
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\n| Doanh so: "+doanhSo+
				"\n_____________________________";
	}
	
	//sap xep thhu nhap giam dan 
	
}
