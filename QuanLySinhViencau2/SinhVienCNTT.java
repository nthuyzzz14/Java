package QuanLySinhViencau2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SinhVienCNTT extends SinhVien{
	private double diemLT;
	
	public SinhVienCNTT() {}
	public SinhVienCNTT(String maSV, String hoTen, double diemTB, double diemLT) {
		super(maSV,hoTen,diemTB);
		this.diemLT = diemLT;
	}
	
	public double getdiemLT() {return diemLT;}
	public void setdiemLT(double diemLT) {this.diemLT = diemLT;}
	
	public void nhapTT(Scanner nhap) {
		super.nhapTT(nhap);
		
		while (true) {
			try {
				System.out.print("Nhap diem mon lap trinh: ");
				diemLT = nhap.nextDouble();
				nhap.nextLine();
				if(diemLT < 0 || diemLT > 10) {
					throw new IllegalArgumentException();
				}
				break;
			} catch (IllegalArgumentException iae) {
				System.out.println("==>> Loi: Diem phai nam trong khoang (0 - 10)");
			} catch (InputMismatchException ime) {
				System.out.println("==> Loi: Vui long nhap so !");
			}
		}
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\n| Diem mon lap trinh: "+diemLT;
	}
	
	@Override
	public double tinhDiemTK() {
		return (diemTB + diemLT) / 2;
	}
}
