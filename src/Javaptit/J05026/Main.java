package Javaptit.J05026;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();

        while (n-- > 0) {
            String name = inp.nextLine();
            String sub = inp.nextLine();
            a.add(new GiangVien(name, sub));
        }

        int q = Integer.parseInt(inp.nextLine());
        String tmp = "";
        while (q-- > 0) {
            String query = inp.nextLine();
            String[] b = query.split("\\s+");
            for (int i = 0; i < b.length; i++) {
                tmp += b[i].substring(0, 1).toUpperCase();
            }

            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (GiangVien i : a) {
                if (i.getSub().equals(tmp)) {
                    System.out.println(i.toString());
                }
            }
            tmp = "";
        }
    }
}
