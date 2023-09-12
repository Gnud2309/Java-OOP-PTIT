package Javaptit.J05011;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] KH = new KhachHang[n];
        for(int i=0;i<n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String giovao = sc.nextLine();
            String giora = sc.nextLine();
            KH[i] = new KhachHang(ma,ten,giovao,giora);
        }
        Arrays.sort(KH);
        for(KhachHang i : KH){
            System.out.println(i);
        }
    }
}
