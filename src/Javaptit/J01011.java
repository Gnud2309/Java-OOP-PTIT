/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;
import java.text.DecimalFormat;
public class J01011 {
    public static long LCM(long a, long b, long res){
        return (a * b) / res;
    }
    public static long GCD(long a, long b){
        if(a == 0 || b == 0){
            return a + b;
        }
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = GCD(a, b);
            System.out.println(LCM(a, b, gcd) + " " + gcd);
            t--;
        }
    }
}
