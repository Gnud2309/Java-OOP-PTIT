package btcovananh.BaithucHanh1;

import java.util.Scanner;


class SanPham{
    private String ma,ten,nhaSX;
    private int soLuong;
    private double gia,thanhTien;
    private static int nextMa = 1; // danhdau
    public SanPham(String ten, int soLuong, double gia, String nhaSX) {
        this.ten = ten;
        this.nhaSX = nhaSX;
        this.soLuong = soLuong;
        this.gia = gia;
        this.ma = getMa(nhaSX);
    }
    public String getMa(String nhaSX) {
        String ma = nhaSX.toUpperCase() + "-" + String.format("%03d", nextMa);
        nextMa++;
        return ma;
    }
    public double getThanhTien() {
        if(this.soLuong <20) return this.soLuong * this.gia;
        else
            return (this.soLuong*this.gia)*90/100; // >=20
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.soLuong + " " + this.gia + " " +this.getThanhTien();
    }
}
public class Bai5taolopsanpham {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten=sc.nextLine();
            nhaSX=sc.nextLine();
            soLuong=Integer.parseInt(sc.nextLine());
            gia=Double.parseDouble(sc.nextLine());
            SanPham p=new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
    }
}


//2
//Galaxy A53
//samsung
//10
//100
//C21 Plus
//nokia
//30
//100