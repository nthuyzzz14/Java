package QuanLyHoSinhcau1;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList <HocSinh> dsHS = new ArrayList<>();

    // nhap danh sach 2 <= n <= 100;
    int n;
    do {
      System.out.print("Nhap danh sach ");
      n = input.nextInt();
      input.nextLine();
      if(n < 2 || n > 100){
        System.out.println("\n==> Loi: Danh sach hoc sinh  2 - 100 !");
      }
    } while(n < 2 || n > 100);

    for (int i = 1; i <= n; i++){
      System.out.println("\n__________ Nhap thong tin cho hoc sinh thu "+i+" _________");

      HocSinh hs = new HocSinh();
      hs.nhapTT(input);
      dsHS.add(hs);
    }

    // hien thi danhsach hoc sinh
    System.out.println("\n_________ Danh Sach Hoc Sinh ___________");
    for(HocSinh hs : dsHS){
      System.out.println(hs);
    }

    
    HocSinh max = dsHS.get(0);
    for(HocSinh hs : dsHS){
      if(hs.getdiem() > max.getdiem()){
        max = hs;
      }
    }

    System.out.println("\n____________ Hoc Sinh Co Diem Cao Nhat _____________");
    System.out.println(max);
  }
}
