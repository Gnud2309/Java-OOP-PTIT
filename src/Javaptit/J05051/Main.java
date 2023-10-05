package Javaptit.J05051;

import java.util.*;


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
        Collections.sort(listKH);
        for (KhachHang khachHang : listKH) {
            System.out.println(khachHang);
        }
    }
}


