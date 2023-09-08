package Javaptit;

import java.util.*;
public class J03032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- >0){
            String s = sc.nextLine();
            s = s.replaceAll("\\s+" , " ");
            String[] arr = s.split(" ");
        for (String x : arr){
                StringBuilder sb = new StringBuilder(x);
                System.out.print(sb.reverse().toString() + " ");
            }
        System.out.println();
        }
    }
}
