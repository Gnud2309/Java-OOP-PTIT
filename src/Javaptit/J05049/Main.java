package Javaptit.J05049;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DonHang[] a = new DonHang[n];
        for (int i = 0; i < n; i++) {
            a[i] = new DonHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }

        Arrays.sort(a, Comparator.comparing(DonHang::getThue));

        String s = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (a[i].getMaHang().startsWith(s)) {
                System.out.println(a[i]);
            }
        }
    }
}