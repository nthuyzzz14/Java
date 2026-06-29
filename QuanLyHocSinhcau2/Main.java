package QuanLyHocSinhcau2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList <HocSinhChuyen> dsHS = new ArrayList<>();

    // nhap danh sach 2 <= n <= 100;
    int n;
    do {
      System.out.print("Nhap danh sach hoc sinh chuyen: ");
      n = input.nextInt();
      input.nextLine();
      if(n < 2 || n > 100){
        System.out.println("\n==> Loi: Danh sach hoc sinh  2 - 100 !");
      }
    } while(n < 2 || n > 100);

    for (int i = 1; i <= n; i++){
      System.out.println("\n__________ Nhap thong tin cho hoc sinh thu "+i+" _________");

      HocSinhChuyen hs = new HocSinhChuyen();
      hs.nhapTT(input);
      dsHS.add(hs);
    }

    // hien thi danhsach hoc sinh
    System.out.println("\n_________ Danh Sach Hoc Sinh ___________");
    for(HocSinhChuyen hs : dsHS){
      System.out.println(hs);
    }

    
    HocSinhChuyen max = dsHS.get(0);
    for(HocSinhChuyen hs : dsHS){
      if(hs.getdiem() > max.getdiem()){
        max = hs;
      }
    }

    System.out.println("\n____________ Hoc Sinh Co Diem Cao Nhat _____________");
    System.out.println(max);

    int z = dsHS.size();
    for (int i = 0; i < z - 1; i++){
      for (int j = 0; j < z - i - 1; j++){
        if(dsHS.get(j).tinhDiem() < dsHS.get(j+1).tinhDiem()){
          HocSinhChuyen temp = dsHS.get(j);
          dsHS.set(j, dsHS.get(j+1));
          dsHS.set(j+1,temp);
        }
      }
    }

    System.out.println("\n________ SAP XEP DIEM ________");
    for (HocSinhChuyen hs : dsHS){
      System.out.println(hs);
    }

    input.close();
  }
}
