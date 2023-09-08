/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

public class J02004 {
    
    static String check(int n,int a[]){
        for(int i=0;i<n;i++)
            if(a[i] != a[n-i-1])
                return "NO";
            return "YES";
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- >0){
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.print(check(n,a));
        }    
    }
}
