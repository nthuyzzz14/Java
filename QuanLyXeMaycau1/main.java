package QuanLyXeMaycau1;

import java.util.Scanner;
import java.util.ArrayList;
public class main {
  public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);
    ArrayList <XeMay> dsXM = new ArrayList<>();

    int n;
    do{
      System.out.print("Nhap danh sach n xe may (2 - 100): ");
      n = nhap.nextInt();
      nhap.nextLine();
      if(n < 2 || n > 100){
        System.out.println("==> Loi: danh sach xe may phai nam trong (2 - 100) !");
      }
    } while (n < 2 || n > 100);

    for(int i = 1; i <= n; i++){
      System.out.println("\n__________ NHAP THONG TIN CHO XE MAY THU "+i+" __________");

      XeMay xm = new XeMay();
      xm.nhapTT(nhap);
      dsXM.add(xm);
    }

    System.out.println("\n_________ DANH SACH XE MAY __________");
    for(XeMay xm : dsXM){
      System.out.println(xm);
    }

    XeMay max = dsXM.get(0);
    for(XeMay xm : dsXM){
      if(xm.tinhGiaBan() > max.tinhGiaBan()){
        max = xm;
      }
    }

    System.out.println("\n__________ XE MAY CO GIA BAN CAO NHAT __________");
    System.out.println(max);
  }
}
