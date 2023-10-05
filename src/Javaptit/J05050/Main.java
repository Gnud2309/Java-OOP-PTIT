package Javaptit.J05050;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String maKH = "KH" + String.format("%02d", i);
            String loaiKH = sc.nextLine();
            int chiSoCu = Integer.parseInt(sc.nextLine());
            int chiSoMoi = Integer.parseInt(sc.nextLine());
            listKH.add(new KhachHang(maKH, loaiKH, chiSoCu, chiSoMoi));
        }
        for (KhachHang khachHang : listKH) {
            System.out.println(khachHang);
        }
    }
}
