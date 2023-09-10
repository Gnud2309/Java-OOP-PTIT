package Javaptit.J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }


        Collections.sort(arr, new Comparator<SinhVien>(){

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getLop().equals(o2.getLop())){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return  o1.getLop().compareTo(o2.getLop());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arr.get(i));
        };
    }
}
