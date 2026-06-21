package kiemtra3;

import java.util.ArrayList;
import java.util.Scanner;

public class QL_Sach {

    private ArrayList<SachGiaoKhoa> dsSach;

    public QL_Sach() {
        dsSach = new ArrayList<>();
    }


    public void nhapDanhSach() {

        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            try {

                System.out.print("Nhap so luong sach (2-100): ");
                n = Integer.parseInt(sc.nextLine());

                if (n < 2 || n > 100) {
                    throw new Exception("n phai trong khoang 2-100");
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.println("\n===== Sach thu " + (i + 1) + " =====");

            SachGiaoKhoa sgk = new SachGiaoKhoa();

            while (true) {
                try {

                    sgk.nhapTT(sc);

                    if (sgk.getGiaThanh() < 0) {
                        throw new Exception("Gia thanh khong duoc am!");
                    }

                    dsSach.add(sgk);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Gia thanh phai la so!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void hienThiSachToan() {

        System.out.println("\n===== DANH SACH SACH MON TOAN =====");

        boolean found = false;

        for (SachGiaoKhoa sgk : dsSach) {

            if (sgk.getMonHoc().contains("Toan")) {
                System.out.println(sgk);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co sach mon Toan!");
        }
    }
}