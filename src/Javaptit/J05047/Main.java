package Javaptit.J05047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang.KhoiTaomap();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new MatHang(sc.nextLine(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(arr);
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }
}
