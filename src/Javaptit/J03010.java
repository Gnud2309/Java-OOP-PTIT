/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.*;

public class J03010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> arr = new ArrayList<>();

        while (t-- > 0) {
            String[] str = sc.nextLine().trim().toLowerCase().split("\\s+");// Đọc địa chỉ email từ đầu vào và chuyển thành chữ thường
            String s = str[str.length - 1];
            for (int i = 0; i < str.length - 1; i++) {
                s += str[i].charAt(0);// Ghép thêm ký tự đầu tiên của mỗi phần vào địa chỉ email mới
            }
            arr.add(s);
            int cnt = Collections.frequency(arr, s);// Đếm tần suất xuất hiện của địa chỉ email mới trong ArrayList
            s += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn"; // Ghép thêm số lần xuất hiện (nếu lớn hơn 1) và tên miền vào địa chỉ email mới
            System.out.println(s);
        }
    }
}

