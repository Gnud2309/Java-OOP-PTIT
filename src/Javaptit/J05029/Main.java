package Javaptit.J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();

        while(t-- > 0){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int sl = sc.nextInt();
            arr.add(new DoanhNghiep(ma,ten,sl));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSoLuong()== o2.getSoLuong()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getSoLuong() -o1.getSoLuong();
            }
        });

        int q =sc.nextInt();
        sc.nextLine();

        while (q-- >0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + l + " DEN "+ r + " SINH VIEN:");
            for(DoanhNghiep x : arr){
                if(x.getSoLuong() >=l && x.getSoLuong()<=r){
                    System.out.println(x);
                }
                else if(x.getSoLuong()<l && x.getSoLuong() >r){
                    break;
                }
            }
        }
    }
}
