package Javaptit.J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        while(t-- >0){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int sl = sc.nextInt();
            arr.add(new DoanhNghiep(ma,ten,sl));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSoLuong() == o2.getSoLuong())
                    return o1.getMa().compareTo(o2.getMa());
                return o2.getSoLuong() -o1.getSoLuong();
            }
        });
        for (DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}
