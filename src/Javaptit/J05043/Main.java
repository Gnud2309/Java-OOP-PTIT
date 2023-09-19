package Javaptit.J05043;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            arr.add(new NhanVien(i+1,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for (NhanVien x : arr){
            System.out.println(x);
        }
    }
}
