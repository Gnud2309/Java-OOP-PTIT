/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

public class J10021 {
    
    static int mod = (int)1e9 +7;
    
    static long powMod(long a,long b){
        long res =1;
        while(b > 0){
            if(b%2==1){
                res = res*a %mod;                
            }
            a=(a*a) %mod;
            b >>=1;
         }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a,b;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0 && b==0){
                break;        
            }
            System.out.println(powMod(a,b));
        }
    }
}
