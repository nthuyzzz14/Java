package QuanLyHocSinhcau2;

import java.util.Scanner;
import java.util.InputMismatchException;
public class HocSinhChuyen extends HocSinh{
  private double diemChuyen;

  public HocSinhChuyen(){}
  public HocSinhChuyen(String ma, String name, double diem, double diemChuyen){
    super(ma,name,diem);
    this.diemChuyen = diemChuyen;
  }

  public double getdiemChuyen(){return diemChuyen;}
  public void setdiemChuyen(double diemChuyen){ this.diemChuyen = diemChuyen;}

  @Override
  public String toString(){
    return super.toString() + "\n| Diem chuyen: "+diemChuyen;
  }

  @Override
  public double tinhDiem(){
    return (diem + diemChuyen * 2) / 3;
  }
  public void nhapTT(Scanner input){
    super.nhapTT(input);

    while(true) {
      try {
        System.out.print("Nhap diem chuyen: ");
        diemChuyen = input.nextDouble();
        input.nextLine();
        if ( diemChuyen < 0 || diemChuyen > 10){
          throw new IllegalArgumentException();
        }
        break;
      } catch (IllegalArgumentException iae){
        System.out.println("==> Loi: Diem phai nam trong khoang 0 - 10 !");
      } catch (InputMismatchException ime){
        System.out.println("==> Loi: Vui long nhap dung du lieu !");
      }
    }
  }

  
}
