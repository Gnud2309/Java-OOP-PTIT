package Javaptit;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class matHang implements Comparable<matHang>{

    private String ma;
    private String tenMatHang;
    private String donViTinh;
    private int giaBan;
    private int giaMua;
    private int loiNhuan;
    private static int  cnt = 1;


    public matHang(String tenMatHang, String donViTinh,int giaMua,int giaBan) {
        this.ma = String.format("MH%03d",cnt++);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        loiNhuan =  giaBan-giaMua;
    }

    @Override
    public String toString() {
        return ma+" "+tenMatHang+" "+donViTinh+" "+giaMua+" " +giaBan+" "+loiNhuan;
    }

    @Override
    public int compareTo(matHang o) {
        if (this.loiNhuan != o.loiNhuan)
            return o.loiNhuan-this.loiNhuan;
        return this.ma.compareTo(o.ma);
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<matHang> arr = new ArrayList<>();
        while(t-- >0)
            arr.add(new matHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        Collections.sort(arr);
        for (matHang i : arr)
            System.out.println(i);
    }
}
