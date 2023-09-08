/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        int cnt =0;
        int k=0;
        while(n>0){
            k = (int) (n%10);
            if(k == 4 ||k == 7 ){
                cnt++;
            }
            n/=10;
        }
        if(cnt ==4 ||cnt ==7){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
