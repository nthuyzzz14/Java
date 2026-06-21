package QuanLySinhVien;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private double diemTB;
	
	public SinhVien(String maSV, String hoTen, double diemTB) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	//getter and stter
	public String getmaSV() { return maSV;}
	public String gethoTen() { return hoTen;}
	public double getdiemTB() { return diemTB;}
	
	public void setmaSV(String maSV) { this.maSV = maSV;}
	public void sethoTen(String hoTen) {
		try {
			// kiem tra neu trong in ra loi
			if(hoTen == null || hoTen.trim().isEmpty()) {
				throw new Exception("Ho ten khong duoc bo trong !");
			}
			// kiem tra neu hoten khong phchu cai thi in ra thong bao loi
			if(!hoTen.matches("[a-zA-Z\\s]+")) {
				throw new Exception("Ho ten duoc nhap phai la chu cai !");
			}
			
			this.hoTen = hoTen;
		} catch (Exception e) {
			System.out.println("Loi "+e.getMessage());
			return;
		}
	}
	
	public void setdiemTB(double diemTB) { this.diemTB = diemTB;}
	
	//xuat thong  tin
	public void xuatTT() {
		 System.out.printf("| Ma sinh vien: %s | Ho ten: %s | Diem trung binh: %.1f",maSV,hoTen,diemTB);
	}
	
	
	// kiem tra va xep loaii sinh vien
	public String xepLoai() {
		if(diemTB >= 9) {
			return "Xep loai: Gioi";
		} 
		else if(diemTB >= 6.5) {
			return "Xep loai: Kha";
		}
		else if(diemTB >= 5) {
			return"xep loai: Trung binh !";
		}
		else {
			return "Xep loai: Yeu";
		}
	}
}