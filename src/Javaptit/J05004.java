package Javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SinhVien2 {
    private static int cnt = 1;
    private String ma;
    private String ten;
    private String ngaySinh;
    private String lop;
    private float gpa;

    public SinhVien2(String ten,String lop, String ngaySinh,  float gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = chuanHoaHoTen(ten);
        this.ngaySinh = ngaySinh;
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



    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}

public class J05004 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dangChuan = new SimpleDateFormat("dd/MM/yyyy");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dateOfBirth = dangChuan.format(dangChuan.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien2 student = new SinhVien2(name,lop, dateOfBirth, gpa);
            System.out.println(student);
        }
    }
}