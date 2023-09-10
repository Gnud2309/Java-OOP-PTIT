package Javaptit.J05024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



//class SinhVien {
//    private String ma, ten, lop, email, index;
//
//    private static final Map<String, String> INDEX_MAP = createIndexMap();
//
//    private static Map<String, String> createIndexMap() {
//        Map<String, String> indexMap = new HashMap<>();
//        indexMap.put("DCCN", "CONG NGHE THONG TIN");
//        indexMap.put("DCAT", "AN TOAN THONG TIN");
//        indexMap.put("DCVT", "VIEN THONG");
//        indexMap.put("DCKT", "KE TOAN");
//        return indexMap;
//    }
//
//    public SinhVien(String ma, String ten, String lop, String email) {
//        this.ma = ma;
//        this.ten = ten;
//        this.lop = lop;
//        this.email = email;
//        this.index = getIndexFromMap();
//    }
//
//    private String getIndexFromMap() {
//        String key = ma.substring(3, 7);
//        if (INDEX_MAP.containsKey(key) && lop.charAt(0) != 'E') {
//            return INDEX_MAP.get(key);
//        }
//        return null;
//    }
//
//    public String getIndex() {
//        return index;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + lop + " " + email;
//    }
//}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine(); // Tiêu thụ dòng chứa số nguyên trước đó

        for (int i = 0; i < t; i++) {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String s = sc.nextLine().toUpperCase();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", s);

            StringBuilder sb = new StringBuilder();
            for (SinhVien sv : arr) {
                if (sv.getIndex() != null && sv.getIndex().equalsIgnoreCase(s)) {
                    sb.append(sv).append("\n");
                }
            }
            System.out.print(sb);
        }
    }
}