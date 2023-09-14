package Javaptit.J05040;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            arr.add(new NhanVien("NV" + String.format("%02d", i + 1), sc.nextLine(), sc.nextInt(), sc.nextInt(),
                    sc.next()));
        }

        int tongChiPhiTienLuong = 0;
        for (NhanVien x : arr) {
            System.out.println(x);
        }
    }
}