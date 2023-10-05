package Javaptit.J05044;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++){
            String ten = sc.nextLine();
            String chucvu = sc.nextLine();
            long luongcb = Long.parseLong(sc.nextLine());
            long ngaycong = Long.parseLong(sc.nextLine());
            arr.add(new NhanVien(i+1,ten,chucvu,luongcb,ngaycong));
        }

        String cv = sc.next();
        for(NhanVien x : arr){
            if(x.getChucVu().equals(cv)){
                System.out.println(x);
            }
        }
    }
}
