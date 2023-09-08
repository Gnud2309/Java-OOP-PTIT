package Javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{

    private String maMon,tenMon,hinhThucThi;

    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMon() {
        return maMon;
    }

    @Override
    public String toString() {
        return maMon+" "+tenMon+" "+hinhThucThi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }
}

public class J07058 {
    public static void main(String[] args)throws FileNotFoundException {

        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();

        for(int i=0;i<t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hinhthuc = sc.nextLine();
            arr.add(new MonHoc(ma,ten,hinhthuc));
        }
        Collections.sort(arr);
        for(MonHoc i : arr)
            System.out.println(i);
    }
}