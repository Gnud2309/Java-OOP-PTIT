package Javaptit.J05052;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String name = sc.nextLine();
            String id = sc.nextLine();
            long price = Long.parseLong(sc.nextLine());
            long amount = Long.parseLong(sc.nextLine());
            arr.add(new DonHang(name, id, price, amount));
        }

        for (DonHang x : arr){
            System.out.println(x);
        }
    }
}
