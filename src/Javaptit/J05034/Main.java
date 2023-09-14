package Javaptit.J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SinhVien> arr = new ArrayList<>();

        int t = sc.nextInt();
        int stt = 1;
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            arr.add(new SinhVien(stt, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            stt++;
        }

        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        int q = sc.nextInt();
        while (q-- >0){
            String s =sc.next();
            for(SinhVien x : arr){
                if(x.getDoanhNgiep().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
