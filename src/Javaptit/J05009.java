package Javaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThuKhoa implements Comparable<ThuKhoa>{
    private int ma;
    private String ten, ngaySinh;
    private Float diem1, diem2, diem3, tongDiem;
    private static int cnt = 1;

    public ThuKhoa(String ten, String ngaySinh, float diem1, float diem2, float diem3) {
        this.ma = cnt++;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = diem1+diem2+diem3;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+ngaySinh+" "+tongDiem;
    }

    @Override
    public int compareTo(ThuKhoa o) {
       if(this.tongDiem.compareTo(o.tongDiem) == 0){
           return (this.ma - o.ma);
       }
       return -this.tongDiem.compareTo(o.tongDiem);
    }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> arr = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String dob = sc.nextLine();
            float p1 = Float.parseFloat(sc.nextLine());
            float p2 = Float.parseFloat(sc.nextLine());
            float p3 = Float.parseFloat(sc.nextLine());
            arr.add(new ThuKhoa(name, dob, p1, p2, p3));
        }
        Collections.sort(arr);
        float maxScore = arr.get(0).getTongDiem();
        for(ThuKhoa i : arr){                   //vòng for này để kiểm tra xem còn giá trị nào bằng với giá trị lớn nhất(maxScore) hay không
            if(i.getTongDiem() == maxScore){
                System.out.println(i);
            }
            else {
                break;
            }
        }
    }
}
