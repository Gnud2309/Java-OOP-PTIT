package javaapplication11;

import java.util.Scanner;

public class j03038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[128];
        int cnt = 0;
        String s =sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]==0){
                cnt++;
                a[s.charAt(i)] = 1;
            }
        }
        System.out.println(cnt);
    }
}
