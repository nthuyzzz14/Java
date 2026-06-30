package QuanLyDienThoaicau2;

import java.util.ArrayList;
import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);
    ArrayList<DienThoaiThongMinh> dsDT = new ArrayList<>();

    int n;
    do{
      System.out.print("Nhap danh sach n dien thoai thong minh (2 - 100): ");
      n = nhap.nextInt();
      nhap.nextLine();
      if(n < 2 || n > 100){
        System.out.println("==> Loi: Danh sach dien thoai thong minh phai nam trong (2 - 100) !");
      }
    }while(n < 2 || n > 100);

    for (int i = 1; i <= n; i++){
      System.out.println("\n____________ NHAP THONG TIN CHO DIEN THOAI TM THU "+i+" ____________");
      DienThoaiThongMinh dt = new DienThoaiThongMinh();
      dt.nhapTT(nhap);
      dsDT.add(dt);
    }

    System.out.println("\n___________ DANH SACH DIEN THOAI TM ____________");
    for(DienThoaiThongMinh dt : dsDT){
      System.out.println(dt);
    }

    DienThoaiThongMinh max = dsDT.get(0);
    for(DienThoaiThongMinh dt : dsDT){
      if(dt.tinhGiaBan() > max.tinhGiaBan()){
        max = dt;
      }
    }

    System.out.println("\n___________ DIEN THOAI TM CO GIA BAN CAO NHAT __________");
    System.out.println(max);

    // sap xep
    double g = dsDT.size();
    for(int i = 0; i < g - 1; i++){
      for(int j = 0; j < n - i - 1; j++){
        if(dsDT.get(j).tinhGiaBan() < dsDT.get(j+1).tinhGiaBan()){
          DienThoaiThongMinh temp = dsDT.get(j+1);
          dsDT.set(j+1, dsDT.get(j));
          dsDT.set(j, temp);
        }
      }
    }

    // hien thi
    System.out.println("\n____________ DANH SACH SAU KHI SAP XEP ____________");
    for(DienThoaiThongMinh dt : dsDT){
      System.out.println(dt);
    }
  }
}