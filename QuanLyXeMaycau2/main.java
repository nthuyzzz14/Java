package QuanLyXeMaycau2;

import java.util.Scanner;
import java.util.ArrayList;
public class main {
  public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);
    ArrayList <XeMayDien> dsXM = new ArrayList<>();

    int n;
    do{
      System.out.print("Nhap danh sach n xe may dien (2 - 100): ");
      n = nhap.nextInt();
      nhap.nextLine();
      if(n < 2 || n > 100){
        System.out.println("==> Loi: danh sach xe may dien phai nam trong (2 - 100) !");
      }
    } while (n < 2 || n > 100);

    for(int i = 1; i <= n; i++){
      System.out.println("\n__________ NHAP THONG TIN CHO XE MAY DIEN THU "+i+" __________");

      XeMayDien xm = new XeMayDien();
      xm.nhapTT(nhap);
      dsXM.add(xm);
    }

    System.out.println("\n_________ DANH SACH XE MAY DIEN __________");
    for(XeMayDien xm : dsXM){
      System.out.println(xm);
    }

    XeMayDien max = dsXM.get(0);
    for(XeMayDien xm : dsXM){
      if(xm.tinhGiaBan() > max.tinhGiaBan()){
        max = xm;
      }
    }

    System.out.println("\n__________ XE MAY DIEN CO GIA BAN CAO NHAT __________");
    System.out.println(max);

    int m = dsXM.size();
    for(int i = 0; i < m -1; i++){
      for(int j = 0; j < m -i - 1; j++){
        if(dsXM.get(j).tinhGiaBan() > dsXM.get(j+1).tinhGiaBan()){
          XeMayDien temp = dsXM.get(j+1);
          dsXM.set(j+1, dsXM.get(j));
          dsXM.set(j, temp);
        }
      }
    }
    System.out.println("\n__________ SAP XEP DANH SACH XE MAY DIEN __________");
    for(XeMayDien xm : dsXM){
      System.out.println(xm);
    }
  }
}
