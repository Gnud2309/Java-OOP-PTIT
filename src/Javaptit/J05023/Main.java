package Javaptit.J05023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<t;i++){
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();

        while(q-- >0){
            int nam = sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA "+ nam +":");
            for(SinhVien sv : arr){
                if(nam == Integer.parseInt("20" + sv.getLop().substring(1,3))){
                    System.out.println(sv);
                }
            }
        }
    }
}







