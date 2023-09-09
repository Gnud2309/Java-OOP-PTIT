package Javaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private int ma;
    private static int cnt = 1;
    private String ten, nhom;
    private float giaMua, giaBan, tienLoi;

    public MatHang(String ten, String nhom, float giaMua, float giaBan) {
        this.ma = cnt++;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.tienLoi = giaBan - giaMua;
    }

    @Override
    public String toString() {

        return ma+" "+ten+" "+nhom+" "+String.format("%.2f", tienLoi);
    }

    @Override
    public int compareTo(MatHang o) {

        return -(Float.compare(this.tienLoi, o.tienLoi));
    }
}

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String nhom = sc.nextLine();
            float giaMua = Float.parseFloat(sc.nextLine());
            float giaBan = Float.parseFloat(sc.nextLine());
            arr.add(new MatHang(name, nhom, giaMua, giaBan));
        }
        Collections.sort(arr);
        for (MatHang i : arr) {
            System.out.println(i);
        }
    }
}
