package Javaptit.J05045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String chucvu= sc.nextLine();
            long luong = Long.parseLong(sc.nextLine());
            long ngaycong =Long.parseLong(sc.nextLine());
            arr.add(new NhanVien(i+1,ten,chucvu,luong,ngaycong));
        }

        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(o1.getThuNhap()== o2.getThuNhap()){
                    return o1.getMa().compareTo(o2.getMa());
                } else{
                    if (o1.getThuNhap() < o2.getThuNhap()) return 1;
                    else return -1;

                }
            }
        });

        for(NhanVien x : arr){
            System.out.println(x);
        }
    }
}
