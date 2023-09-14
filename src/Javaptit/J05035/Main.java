package Javaptit.J05035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SinhVien> arr = new ArrayList<>();

        int t = Integer.parseInt(sc.nextLine());
        int stt =1;
        while(t-->0){
            arr.add(new SinhVien(stt,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
            stt++;
        }

        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        int q = sc.nextInt();
        while(q-->0){
            String s = sc.next();
            for(SinhVien x : arr){
                if(x.getDoanhNgiep().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
