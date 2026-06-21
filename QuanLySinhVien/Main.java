package QuanLySinhVien;

public class Main {
	public static void main(String[] args) {
		// danh sach sinh bien
		SinhVien sv1 =  new SinhVien("m01","Hoang Van Chien",8.0);
		SinhVien sv2 =  new SinhVien("m02","Nguyen Minh Tai",4.0);
		SinhVien sv3 =  new SinhVien("m03","Hoang Van Duy",7.0);

		// xuat thong itn va xep loai
		sv1.xuatTT();
		sv1.xepLoai();
		
		System.out.println("\n-----------------------------------------------------------------------");
		sv2.xuatTT();
		sv2.xepLoai();
		
		System.out.println("\n-----------------------------------------------------------------------");
		sv3.xuatTT();
		sv3.xepLoai();
	}
}
