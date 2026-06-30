package QuanLyDienThoaicau1;

import java.util.Scanner;
public class DienThoai {
  private String ma;
  private String ten;
  private double gia;

  public DienThoai(){}
  public DienThoai(String ma, String ten, double gia){
    this.ma = ma;
    this.ten = ten;
    this.gia = gia;
  }

  public String getma(){return ma;}
  public String getten(){return ten;}
  public double getgia(){return gia;}

  public void setma(String ma){this.ma = ma;}
  public void setten(String ten){this.ten = ten;}
  public void setgia(double gia){this.gia = gia;}

  public void nhapTT(Scanner nhap){
    System.out.print("Nhap ma dien thoai: ");
    ma = nhap.nextLine();

    while(true){
      try {
        System.out.print("Nhap ten dien thoai: ");
        ten = nhap.nextLine();
        if(ten.trim().isEmpty()){
          throw new Exception();
        }
        break;
      } catch (Exception e){
        System.out.println("==> Loi: Ten dien thoai khon duoc de trong !");
      }
    }

    while (true){
      try {
        System.out.print("Nhap gia nhap dien thoai: ");
        gia = nhap.nextDouble();
        nhap.nextLine();
        if(gia <= 0){
          throw new IllegalArgumentException();
        }
        break;
      } catch (IllegalArgumentException iae){
        System.out.println("==> Loi gia nhap cua dien thoai phai > 0 !");
      }
    }
  }

  @Override
  public String toString(){
    return "\n____________________"+
            "\n| Ma dien thoai: "+ma+
            "\n| Ten dien thoai: "+ten+
            "\n| Gia nhap: "+gia+
            "\n____________________";
  }

  public double tinhGiaBan(){
    return gia * 1.15;
  }
}
