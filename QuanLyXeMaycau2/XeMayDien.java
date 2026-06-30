package QuanLyXeMaycau2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class XeMayDien extends XeMay{
  private double giaPin;

  public XeMayDien(){}
  public XeMayDien(String ma, String hangSX, double giaNhap, double giaPin){
    super(ma,hangSX,giaNhap);
    this.giaPin = giaPin;
  }

  public double getgiaPin(){return giaPin;}
  public void setgiaPin(double giaPin){this.giaPin = giaPin;}

  @Override
  public String toString(){
    return super.toString() + "\n| Gia pin: "+giaPin;
  }

  public void nhapTT(Scanner nhap){
    super.nhapTT(nhap);

    while(true){
      try{
        System.out.print("Nhap gia pin: ");
        giaPin = nhap.nextDouble();
        nhap.nextLine();
        if(giaPin < 0){
          throw new IllegalArgumentException();
        }
        break;
      } catch (IllegalArgumentException iae){
        System.out.println("==> Loi: Gia pin phai != 0 !");
      } catch (InputMismatchException ime){
        System.out.println("==> Loi: Vui long nhap dung du lieu !");
      }
    }
  }

  @Override
  public double tinhGiaBan(){
    return giaNhap * 1.2 + giaPin;
  }
}
