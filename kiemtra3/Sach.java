package kiemtra3;


import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private double giaThanh;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, double giaThanh) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaThanh = giaThanh;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void nhapTT(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap gia thanh: ");
        giaThanh = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach
                + ", Ten sach: " + tenSach
                + ", Gia thanh: " + giaThanh;
    }
}