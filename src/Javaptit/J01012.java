/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int res = 0;
            if(n % 2 == 0) res += 1;
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    if(i % 2 == 0) res++;
                    if((n / i) % 2 == 0) res++;
                    if (i * i == n && i % 2 == 0) res--;
                }
            }
            System.out.println(res);
            t--;
        }
    }
}
