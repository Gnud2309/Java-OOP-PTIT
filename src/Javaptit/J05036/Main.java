package Javaptit.J05036;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<QuanLy> arr = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 1;i<=t;i++){
            sc.nextLine();
            String m = String.format("MH%02d", i);
            arr.add(new QuanLy(m,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong()));
        }
        for(QuanLy x : arr){
            System.out.println(x);
        }
    }
}
