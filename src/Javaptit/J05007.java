package Javaptit;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


class SXNhanVien implements Comparable<SXNhanVien>{
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String maSoThue;
    private Date kiHopDong;
    private static int cnt = 1;
    public SXNhanVien(String ten, String gioiTinh, Date ngaySinh, String diaChi, String maSoThue, Date kiHopDong) {
        this.ma = String.format("%05d",cnt++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.kiHopDong = kiHopDong;
    }

    public String chuanHoaNgayThang(Date date){
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        return dt.format(date);
    }
    @Override
    public String toString() {
        return ma+" " +ten+" "+gioiTinh+" "+chuanHoaNgayThang(ngaySinh)+" "+diaChi+" "+maSoThue+" "+chuanHoaNgayThang(kiHopDong);
    }

    @Override
    public int compareTo(SXNhanVien o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }

}
public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SXNhanVien> arr = new ArrayList<>();
        while(t-- >0){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            Date birth = sdf.parse(sc.nextLine());
            String address = sc.nextLine();
            String thue = sc.nextLine();
            Date hd = sdf.parse(sc.nextLine());
            arr.add(new SXNhanVien(name,sex,birth,address,thue,hd));
        }
        Collections.sort(arr);
        for(SXNhanVien i : arr){
            System.out.println(i);
        }
    }
}
