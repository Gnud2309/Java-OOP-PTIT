package Javaptit.J05022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LKSinhVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new LKSinhVien(ma, ten, lop, email));
        }

        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (LKSinhVien sv : arr) {
                if (sv.getLop().equals(lop)) {
                    System.out.println(sv);
                }
            }
        }
        sc.close();
    }
}
//Thông tin về mỗi sinh viên gồm:
//Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau.
//Họ và tên: độ dài không quá 100
//Lớp: dãy ký tự không có khoảng trống (không quá 15)
//Email: dãy ký tự không có khoảng trống (không quá 15)
//Hãy nhập danh sách sinh viên và liệt kê sinh viên theo lớp
//Input
//Dòng đầu ghi số sinh viên (không quá 1000)
//Mỗi sinh viên ghi trên 4 dòng lần lượt là: mã, họ tên, lớp, email.
//Sau đó sẽ có giá trị số Q là số truy vấn
//Tiếp theo là Q dòng, mỗi dòng ghi một lớp
//Output
//Với mỗi truy vấn, liệt kê danh sách sinh viên của lớp đó theo mẫu như trong ví dụ. Mỗi sinh viên ghi trên một dòng, các thông tin cách nhau một khoảng trống. Thứ tự sinh viên vẫn giữ nguyên như thứ tự ban đầu.
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B
//output
//DANH SACH SINH VIEN LOP D15CQKT02-B:
//B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn
//B15DCKT199 Nguyen Trong Tung D15CQKT02-B sv4@stu.ptit.edu.vn