package QuanLyDienThoaicau1;

import java.util.ArrayList;
import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);
    ArrayList<DienThoai> dsDT = new ArrayList<>();

    int n;
    do{
      System.out.print("Nhap danh sach n dien (2 - 100): ");
      n = nhap.nextInt();
      nhap.nextLine();
      if(n < 2 || n > 100){
        System.out.println("==> Loi: Danh sach dien thoai phai nam trong (2 - 100) !");
      }
    }while(n < 2 || n > 100);

    for (int i = 1; i <= n; i++){
      System.out.println("\n____________ NHAP THONG TIN CHO DIEN THOAI THU "+i+" ____________");
      DienThoai dt = new DienThoai();
      dt.nhapTT(nhap);
      dsDT.add(dt);
    }

    System.out.println("\n___________ DANH SACH DIEN THOAI ____________");
    for(DienThoai dt : dsDT){
      System.out.println(dt);
    }

    DienThoai max = dsDT.get(0);
    for(DienThoai dt : dsDT){
      if(dt.tinhGiaBan() > max.tinhGiaBan()){
        max = dt;
      }
    }

    System.out.println("\n___________ DIEN THOAI CO GIA BAN CAO NHAT __________");
    System.out.println(max);
  }
}