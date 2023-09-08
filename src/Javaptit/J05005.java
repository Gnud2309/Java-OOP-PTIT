package Javaptit;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SinhVien3 implements Comparable<SinhVien3> {
    private static int cnt = 1;
    private String ma;
    private String ten;
    private String ngaySinh;
    private String lop;
    private float gpa;

    public SinhVien3(String ten,String lop, String ngaySinh,  float gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = chuanHoaHoTen(ten);
        this.ngaySinh = chuanhoaNgaySinh(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    public String chuanHoaHoTen(String ten){
        String[] word = ten.trim().split("\\s+");
        String res ="";
        for(String i : word){
            res += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() +" ";
        }
        return res.substring(0, res.length() - 1);
    }
    private String chuanhoaNgaySinh(String s) {
        String[] str = s.split("/");
        String res = "";
        for (String i : str) {
            if (i.length() == 1) {
                i = "0" + i;
            }
            res += i + "/";
        }
        return res.substring(0, res.length() - 1);
    }


    public Float getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(SinhVien3 other) {
        return -(this.getGpa().compareTo(other.getGpa()));
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }


}

public class J05005 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        List<SinhVien3> arr = new ArrayList<>(t);
        for (int i = 1; i <= t; i++) {
            ip.nextLine();
            String Name = ip.nextLine();
            String Room = ip.nextLine();
            String Date = ip.nextLine();
            float Gpa = ip.nextFloat();
            SinhVien3 x = new SinhVien3(Name, Room, Date, Gpa);
            arr.add(x);
        }
        Collections.sort(arr);
        for (SinhVien3 i : arr) {
            System.out.println(i);
        }
    }
}