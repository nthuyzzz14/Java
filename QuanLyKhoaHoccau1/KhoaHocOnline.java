package QuanLyKhoaHoccau1;

import java.util.Scanner;
public class KhoaHocOnline extends KhoaHoc{
  private String nenTang;
  private int soBuoi;

  public KhoaHocOnline(){}
  public KhoaHocOnline(String maKH, String tenKH, String giangVien, double hocPhi, String nenTang, int soBuoi){
    super(maKH,tenKH,giangVien,hocPhi);
    this.nenTang = nenTang;
    this.soBuoi = soBuoi;
  }

  public String getnenTang(){return nenTang;}
  public int getsoBuoi(){return soBuoi;}

  public void setnenTang(String nenTang){this.nenTang = nenTang;}
  public void setsoBuoi(int soBuoi){this.soBuoi = soBuoi;}

  @Override
  public String toString(){
    return super.toString()+ "\n| Nen tang hoc: "+nenTang+
    "\n| So buoi hoc: "+soBuoi+
    "\n_______________________";
  }

  public void nhapTT(Scanner nhap){
    super.nhapTT(nhap);

    System.out.print("Nhap nen tang hoc: ");
    nenTang = nhap.nextLine();
  
    System.out.print("Nhap so buoi hoc: ");
    soBuoi = nhap.nextInt();
  }
}
