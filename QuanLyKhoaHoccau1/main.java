package QuanLyKhoaHoccau1;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
  public static void main(String [] args){
    Scanner nhap = new Scanner(System.in);
    ArrayList <KhoaHocOnline> dsKH = new ArrayList<>();

    int n;
    do {
      System.out.print("Nhap n khoa hoc (n > 0): ");
      n = nhap.nextInt();
      if(n <= 0){
        System.out.println("==> Loi: So luong khoa hoc phai (> 0) !");
      }
    }while (n <= 0);

    // nhap thong tin cho tung khoa hoc
    for(int i = 1; i <= n; i++){
      System.out.println("\n__________ NHAP THONG TIN CHO KHOA HOC ONLINE THU "+i+" __________");

      KhoaHocOnline kh = new KhoaHocOnline();
      kh.nhapTT(nhap);
      dsKH.add(kh);
    }

    //hien thi khao hoc
    System.out.println("\n_________ DANH SACH KHOA HOC ONLINE __________");
    for(KhoaHocOnline kh : dsKH){
      System.out.println(kh);
    }

    // tim khoa hoc co hoc phi lon nhat
    KhoaHocOnline max = dsKH.get(0);
    for(KhoaHocOnline kh : dsKH){
      if(kh.gethocPhi() > max.gethocPhi())
        max = kh;
    }

    System.out.println("\n__________ KHOA HOC CO HOC PHI LON NHAT ___________");
    System.out.println(max);

    // sap xep tang theo hoc phi
    double s = dsKH.size();
    for(int i = 0; i < n - 1; i++){
      for(int j = 0; j < n - i - 1; j++){
        if(dsKH.get(j).gethocPhi() > dsKH.get(j+1).gethocPhi()){
          KhoaHocOnline temp = dsKH.get(j);
          dsKH.set(j, dsKH.get(j+1));
          dsKH.set(j+1, temp);
        }
      }
    }

    System.out.println("\n__________ DANH SACH KHOA HOC ONLINE SAU KHI SAP XEP __________");
    for(KhoaHocOnline kh : dsKH){
      System.out.println(kh);
    }

    // tim khoa hoc chua java
    System.out.println("\n____________ DANH SACH MON HOC CHUA 'jAVA' ____________ ");
    boolean found = false;
    for(KhoaHocOnline kh : dsKH){
      if (kh.gettenKH().contains("Java")){
        System.out.println(kh);
        found = true;
      }
    }
    if (!found){
      System.out.println("==> Khong tim thay mon hoc chua 'Java' !");
    }

    //dem so khoa hoc startsWith("N")
    int count = 0;
    for(KhoaHocOnline kh : dsKH){
      if(kh.getgiangVien().startsWith("N"))
        count++;
    }

    System.out.println("\n| So khoa hoc co giang vien bat dau 'N': "+count);

    System.out.println("\n__________ KIEM TRA MA KHOA HOC ONLINE __________");
    for (KhoaHocOnline kh : dsKH){
      if (kh.getmaKH().matches("KH\\d{3}")){
        System.out.println(kh.getmaKH() + " hop le !");
      }
      else {
        System.out.println(kh.getmaKH() + " khong hop le !");
      }
    }
  }
}
