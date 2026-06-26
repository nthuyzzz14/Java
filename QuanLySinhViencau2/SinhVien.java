package QuanLySinhViencau2;

import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class SinhVien {
	private String maSV;
	private String hoTen;
	protected double diemTB;
	
	//constructor
	public SinhVien() {}
	public SinhVien(String maSV,String hoTen, double diemTB) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	//getter and setter
	public String getmaSV () { return maSV;}
	public String gethoTen() {return hoTen;}
	public double getdiemTB() {return diemTB;}
	
	public void setmaSV(String maSV) {this.maSV = maSV;}
	public void sethoTen(String hoTen) {this.hoTen = hoTen;}
	public void setdiemTB(double diemTB) {this.diemTB = diemTB;}
	
	// xep loai sinh vien
	public void xepLoai() {
		if(diemTB >= 8) {
			System.out.println("Xep loai: Gioi");
		}
		else if(diemTB >= 6.5) {
			System.out.println("Xep loai: Kha");
		}
		else if(diemTB >= 5) {
			System.out.println("Xep loai: Trung binh");
		}
		else {
			System.out.println("Xep loai: Kem");
		}
	}
	
	public void nhapTT(Scanner nhap) {
		System.out.print("Nhap ma sinh vien: ");
		maSV = nhap.nextLine();
		
		//nhap ho ten  dung while de nhap lai neu nhu bat duoc excception
		while(true) {
			try {
				System.out.print("Nhap ho ten sinh vien: ");
				hoTen = nhap.nextLine();
				
				if (hoTen.trim().isEmpty()) {
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("==>> Loi: Ten rong !");
			}
		}
		
		// nhap diem  dung while de nhap lai, neu nhu bat duoc exception
		while(true) {
			try {
				System.out.print("Nhap diem: ");
				diemTB = nhap.nextDouble();
				nhap.nextLine();
				if(diemTB < 0 || diemTB > 10) {
					throw new IllegalArgumentException();
				}
				break;
			} catch (IllegalArgumentException iae) {
				System.out.println("==> Loi: Diem phai nam trong (0 - 10)");
			} catch (InputMismatchException ime) {
				System.out.println("==>> Loi: Vui long nhap so !");
				nhap.nextLine();
			}
		}
	}
	
	//hien thi ra man hinh
	@Override
	public String toString() {
		return	"_______________________"+ 
				"\n| Ma sinh vien: "+maSV+
				"\n| Ho va ten: "+hoTen+
				"\n| Diem: "+diemTB+
				"\n______________________";
	}
	
	public abstract double tinhDiemTK();
	
}
