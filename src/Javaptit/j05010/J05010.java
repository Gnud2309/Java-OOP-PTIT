package Javaptit.j05010;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
