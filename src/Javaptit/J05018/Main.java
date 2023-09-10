package Javaptit.J05018;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HocSinh[] ds = new HocSinh[t];
        while(t-- >0){
            sc.nextLine();
            String name = sc.nextLine();
            Float[] diem = new Float[10];
            for(int i=0;i<10;i++){
                diem[i]= sc.nextFloat();
            }
            ds[t] = new HocSinh(name,diem);
        }
        Arrays.sort(ds);
        for(HocSinh i : ds){
            System.out.println(i);
        }

    }
}
