package QuanLyXeMaycau1;

import java.util.Scanner;
public class XeMay {
  private String ma;
  private String hangSX;
  private double giaNhap;

  public XeMay(){}
  public XeMay(String ma, String hangSX, double giaNhap){
    this.ma = ma;
    this.hangSX = hangSX;
    this.giaNhap = giaNhap;
  }

  public String getma(){return ma;}
  public String gethangSX(){return hangSX;}
  public double getgiaNhap(){return giaNhap;}

  public void setma(String ma){this.ma = ma;}
  public void sethangSX(String hangSX){this.hangSX = hangSX;}
  public void setgiaNhap(double giaNhap){this.giaNhap = giaNhap;}

  public void nhapTT(Scanner nhap){
    System.out.print("Nhap ma xe: ");
    ma = nhap.nextLine();

    while(true){
      try{
        System.out.print("Nhap ten hang san xuat: ");
        hangSX = nhap.nextLine();

        if(hangSX.trim().isEmpty()){
          throw new Exception();
        }
        break;
      } catch (Exception e){
        System.out.println("==> Loi: Hang san xuat trong , vui long nhap lai !");
      }
    }

    while (true){
      try{
        System.out.print("Nhap gia nhap xe: ");
        giaNhap = nhap.nextDouble();
        nhap.nextLine();
        if(giaNhap <= 0){
          throw new Exception();
        }
        break;
      } catch (Exception e){
        System.out.println("==> Loi: Gia nhap phai <= 0 !");
      }
    }
  }

  @Override
  public String toString(){
    return "\n________________"+
            "\n| Ma xe: "+ma+
            "\n| Ten hang: "+hangSX+
            "\n| Gia nhap: "+giaNhap+
            "\n________________";
  }

  public double tinhGiaBan(){
    return giaNhap * 1.2;
  }
}
