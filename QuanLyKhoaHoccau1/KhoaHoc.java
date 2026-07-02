package QuanLyKhoaHoccau1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class KhoaHoc {
  private String maKH;
  private String tenKH;
  private String giangVien;
  private double hocPhi;

  public KhoaHoc(){}
  public KhoaHoc(String maKH, String tenKH, String giangVien, double hocPhi){
    this.maKH = maKH;
    this.tenKH = tenKH;
    this.giangVien = giangVien;
    this.hocPhi = hocPhi;
  }

  public String getmaKH(){return maKH;}
  public String gettenKH(){return tenKH;}
  public String getgiangVien(){return giangVien;}
  public double gethocPhi(){return hocPhi;}

  public void setmaKH(String maKH){this.maKH = maKH;}
  public void settenKH(String tenKH){this.tenKH = tenKH;}
  public void setgiangVien(String giangVien){this.giangVien = giangVien;}
  public void sethocPhi(double hocPhi){this.hocPhi = hocPhi;}

  public void nhapTT(Scanner nhap){
    System.out.print("Nhap ma khoa hoc: ");
    maKH = nhap.nextLine();
    nhap.nextLine();
    System.out.print("Nhap ten khoa hoc: ");
    tenKH = nhap.nextLine();
    
    System.out.print("Nhap ten giang vien: ");
    giangVien = nhap.nextLine();
    
    while (true){
      try{
        System.out.print("Nhap hoc phi: ");
        hocPhi = nhap.nextDouble();
        nhap.nextLine();
        if(hocPhi < 0){
          throw new IllegalArgumentException();
        }
        break;
      } catch(IllegalArgumentException iae){
        System.out.println("==> Loi: Hoc phi phai >= 0 !");
      } catch(InputMismatchException ime){
        System.out.println("==> Loi: Vui long nhap dung du lieu !");
      }
    }
  }

  @Override
  public String toString(){
    return "\n_______________________"+
    "\n| Ma khoa hoc: "+maKH+
    "\n| Ten khoa hoc: "+tenKH+
    "\n| Giang vien: "+giangVien+
    "\n| Hoc phi: "+hocPhi+
    "\n_______________________";
  }
}
