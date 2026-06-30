package QuanLyDienThoaicau2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DienThoaiThongMinh extends DienThoai{
  private double ram;

  public DienThoaiThongMinh(){}
  public DienThoaiThongMinh(String ma, String ten, double gia, double ram){
    super(ma,ten,gia);
    this.ram = ram;
  }

  public double getram(){return ram;}
  public void setram(double ram){this.ram = ram;}

  @Override
  public String toString(){
    return super.toString() + "\n| Dung luong RAM: "+ram+
    "\n_______________";
  }

  public void nhapTT(Scanner nhap){
    super.nhapTT(nhap);

    while (true){
      try{
        System.out.print("Nhap dung luong RAM: ");
        ram = nhap.nextDouble();
        nhap.nextLine();
        if(ram < 2){
          throw new IllegalArgumentException();
        }
        break;
      } catch (IllegalArgumentException iae){
        System.out.println("==> Loi: Dung luong RAM phai >= 2 !");
      } catch (InputMismatchException ime){
        System.out.println("==> Loi: Vui long nhap dung du lieu !");
      }
    }
  }

  @Override
  public double tinhGiaBan(){
    return gia * 1.15 + ram * 500000;
  }
}
