package kiemtra3;


import java.util.Scanner;

public class SachGiaoKhoa extends Sach {

    private String monHoc;
    private String capDo;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String tenSach,
                        double giaThanh,
                        String monHoc,
                        String capDo) {

        super(maSach, tenSach, giaThanh);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    public void nhapTT(Scanner sc) {

        super.nhapTT(sc);

        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();

        System.out.print("Nhap cap do (Tieu hoc/Trung hoc): ");
        capDo = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Mon hoc: " + monHoc
                + ", Cap do: " + capDo;
    }
}
