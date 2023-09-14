package Javaptit.J05037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<QuanLy> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            String m = String.format("MH%02d", i);
            arr.add(new QuanLy(m, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }

        Collections.sort(arr, new Comparator<QuanLy>() {
            @Override
            public int compare(QuanLy o1, QuanLy o2) {
                if (o1.giaBan() > o2.giaBan()) {
                    return -1;
                } else if (o1.giaBan() < o2.giaBan()) {
                    return 1;
                }
                return 0;
            }
        });

        for (QuanLy x : arr) {
            System.out.println(x);
        }
    }
}