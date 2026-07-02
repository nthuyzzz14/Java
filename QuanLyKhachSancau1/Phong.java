package QuanLyKhachSancau1;

import java.util.Scanner;
public class Phong {
  private String maPhong;
  private String loaiPhong;
  private double giaThue;
  private int soNgay;

  public Phong(){}
  public Phong(String maPhong, String loaiPhong, double giaThue, int soNgay){
    this.maPhong = maPhong;
    this.loaiPhong = loaiPhong;
    this.giaThue = giaThue;
    this.soNgay = soNgay;
  }

  public String getmaPhong(){return maPhong;}
  public String getloaiPhong(){return loaiPhong;}
  public double getgiaThue(){return giaThue;}
  public int getsoNgay(){return soNgay;}

  public void setmaPhong(String maPhong){this.maPhong = maPhong;}
  public void setloaiPhong(String loaiPhong){this.loaiPhong = loaiPhong;}
  public void setgiaThue(double giaThue){this.giaThue = giaThue;}
  public void setsoNgay(int soNgay) {this.soNgay = soNgay;}

  public double tienThue(){
    return giaThue * soNgay;
  }

  public String chuanhoaloaiPhong(){
    return loaiPhong.toUpperCase();
  }

  
}
