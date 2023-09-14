package Javaptit.J05027;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();

        while(t-- >0){
            String ten = sc.nextLine();
            String monHoc = sc.nextLine();
            list.add(new GiangVien(ten,monHoc));
        }

        int q = Integer.parseInt(sc.nextLine());
        while(q-- >0){
            String tukhoa = sc.nextLine();
            String key =tukhoa.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "  + tukhoa +":");
            for(GiangVien i : list){
                if(i.getTen().toLowerCase().contains(key)){
                    System.out.println(i);
                }
            }
        }

    }
}
