package Javaptit.J05046;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang.khoiTaomap();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            int soluong = sc.nextInt();
            int donggia = sc.nextInt();
            sc.nextLine();
            MatHang a = new MatHang(ten, soluong, donggia);
            System.out.println(a);
        }
    }
}
