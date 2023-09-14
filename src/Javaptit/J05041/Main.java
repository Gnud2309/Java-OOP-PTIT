package Javaptit.J05041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i=1; i<=t; i++) {
            sc.nextLine();
            String ma = "NV" + String.format("%02d", i);
            String ten = sc.nextLine();
            int luongCB = Integer.parseInt(sc.nextLine());
            int ngayCong = Integer.parseInt(sc.nextLine());
            String chucVu = sc.nextLine();
            arr.add(new NhanVien(ma, ten, luongCB, ngayCong, chucVu));
        }

        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                int thunhap1 = o1.thuNhap();
                int thunhap2 = o2.thuNhap();
                if (thunhap1 > thunhap2) {
                    return -1;
                } else if (thunhap1 < thunhap2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (NhanVien i : arr) {
            System.out.println(i);
        }
    }
}