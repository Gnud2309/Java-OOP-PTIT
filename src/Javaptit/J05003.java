package Javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SinhVien1 {
    private static int cnt = 1;
    private String ma;
    private String ten;
    private String ngaySinh;
    private String lop;
    private float gpa;

    public SinhVien1(String ten,String lop, String ngaySinh,  float gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}

public class J05003 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dangChuan = new SimpleDateFormat("dd/MM/yyyy");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dateOfBirth = dangChuan.format(dangChuan.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien1 student = new SinhVien1(name,lop, dateOfBirth, gpa);
            System.out.println(student);
        }
    }
}