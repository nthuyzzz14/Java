package QuanLyHoSinhcau1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class HocSinh {
  private String ma;
  private String name;
  private double diem;

  public HocSinh(){}
  public HocSinh(String ma, String name, double diem){
    this.ma = ma;
    this.name = name;
    this.diem = diem;
  }

  // getter
  public String getma(){ return ma;}
  public String getname() { return name;}
  public double getdiem(){ return diem;}

  //setter
  public void setma(String ma){this.ma = ma;}
  public void setname(String name){this.name = name;}
  public void setdiem(double diem){this.diem = diem;}

  //void nhap tt and bat exception
  public void nhapTT(Scanner input){
    System.out.print("Nhap ma hoc sinh: ");
    ma = input.nextLine();

    //nhap ten va bat exception ten trong
    while(true){
      try{
        System.out.print("Nhap ten hoc sinh: ");
        name = input.nextLine();
        if(name.trim().isEmpty()){
          throw new Exception();
        }
        break;
      } catch (Exception e){
        System.out.println("\n==> Loi: ten bi bo trong !");
      }
    }

    // nhap diem va bat exception
    while(true){
      try{
        System.out.print("Nhap diem: ");
        diem = input.nextDouble();
        input.nextLine();
        if(diem < 0 || diem > 10){
          throw new IllegalArgumentException();
        }
        break;
      } catch (IllegalArgumentException iae){
        System.out.println("\n==> Loi: diem phai nam trong khoang 0 - 10 !");
      } catch (InputMismatchException ime){
        System.out.println("\n==> Loi: Vui long nhap dung du lieu !");
      }
    }
  }

  @Override
  public String toString(){
    return "\n_______________"+
            "\n| Ma: "+ma+
            "\n| Ten: "+name+
            "\n| Diem: "+diem+
            "\n__________________";
  }
 
  public void xepLoai(){
    if (diem >= 8){
      System.out.println("Xep loai: Gioi ");
    } else if(diem >= 6.5){
      System.out.println("Xep loai: Kha");
    } else if(diem >= 5){
      System.out.println("Xep loai: Trung binh");
    } else {
      System.out.println("Xep loai: Yeu");
    }
  }

  //hien thi thong tin
  public void hienTT(){
    System.out.println("\n__________ Hoc sinh co diem cao nhat __________");
    System.out.println("Ma: "+ma);
    System.out.println("Ten: "+name);
    System.out.println("Diem: "+diem);
  }
}