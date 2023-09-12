package Javaptit.J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        while(n-- >0){
            String ten = sc.nextLine();
            String monhoc = sc.nextLine();
            arr.add(new GiangVien(ten,monhoc));
        }

        Collections.sort(arr, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                String[] a = o1.getTen().split("\\s+");
                String[] b = o2.getTen().split("\\s+");
                return a[a.length-1].compareTo(b[b.length-1]);
            }
        });

        for(GiangVien i : arr){
            System.out.println(i);
        }
    }
}
