package javaapplication11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private String ma = "B20DCCN001";
    private String ten,lopHoc,ngaySinh;
    private float gpa;

    SinhVien(){
        ten ="";
        lopHoc= "";
        ngaySinh = "";
        gpa = 0f;
    }
    public SinhVien(String ten, String lopHoc, String ngaySinh, float gpa) {
        this.ten = ten ;
        this.lopHoc = lopHoc ;
        this.ngaySinh = ngaySinh ;
        this.gpa = gpa ;
    }

    public String chuanHoaNgaySinh() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ngaySinh);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return ma +" "+ ten+" " +lopHoc+" "+chuanHoaNgaySinh()+" "+String.format("%.2f\n",gpa);
    }
}

public class J04006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String birth = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien x = new SinhVien(name,lop,birth,gpa);
        System.out.println(x);
    }
}
