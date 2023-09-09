package Javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class DSNhanVien implements Comparable<DSNhanVien>{
    private String ma;
    private String ten;
    private String gioiTinh;
    String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String kiHopDong;
    private static int cnt = 1;
    public DSNhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String kiHopDong) {
        this.ma = String.format("%05d",cnt++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.kiHopDong = kiHopDong;
    }

    @Override
    public String toString() {
        return ma+" " +ten+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSoThue+" "+kiHopDong;
    }

    @Override
    public int compareTo(DSNhanVien o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}

public class J05006 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DSNhanVien> arr = new ArrayList<>();
        while(t-- >0){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String birth = sdf.format(sdf.parse(sc.nextLine()));
            String address = sc.nextLine();
            String thue = sc.nextLine();
            String hd = sdf.format(sdf.parse(sc.nextLine()));
            arr.add(new DSNhanVien(name,sex,birth,address,thue,hd));
        }
        Collections.sort(arr);
        for(DSNhanVien i : arr){
            System.out.println(i);
        }
    }
}
