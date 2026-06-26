package QuanLyNhanVien;

import java.util.Scanner;
public class NhanVien {
	private String maNV;
	private String hoTen;
	protected double luongCB;
	
	public NhanVien() {};
	public NhanVien(String maNV, String hoTen, double luongCB) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCB = luongCB;
	}
	
	//getter
	public String getmaNV() {return maNV;}
	public String gethoTen() {return hoTen;}
	public double getluongCB() {return luongCB;}
	
	//setter
	public void setmaNV(String maNV) {this.maNV = maNV;}
	public void sethoTen(String hoTen) {this.hoTen = hoTen;}
	public void setluongCB(double luongCB) {this.luongCB = luongCB;}
	
	//thu nhap nv
	public double thuaNhap() {
		return luongCB;
	}
	
	//nhap tt
	public void nhapTT(Scanner nhap) {
		System.out.print("Nhap ma nhan vien: ");
		maNV = nhap.nextLine();
		nhap.nextLine();
		//nhap ten
		while(true) {
			try {
				System.out.print("Nhap ten nhan vien: ");
				hoTen = nhap.nextLine();
				//bat ten rong
				if (hoTen.trim() == null || hoTen.trim().isEmpty()) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("Loi: Ten nhan vien khong duoc bo trong !");
			}
		}
		
		//nhapluong
		while(true) {
			try {
				System.out.print("Nhap luong nhan vien: ");
				luongCB = nhap.nextDouble();
				//bat loi luong am
				if (luongCB < 0) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("Loi: nhap sai du lieu Luong nhan vien !");
			}
		}
	}
	
	//hien thi thong tin
	@Override
	public String toString() {
		return "| Ma nhan vien: "+maNV+
				"| Ten nhan vien: "+hoTen+
				"| Luong co ban: "+luongCB;
	}
}
