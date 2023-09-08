/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

public class J01008 {
    
    public static void Solution(int n){
        int cnt = 0;
        for(int i=2;i<=n;i++){
            if(n%i == 0){
                System.out.print(i + "(");
                while(n%i == 0){
                    n/=i;
                    cnt++;
                }
                System.out.print((cnt) + ") ");
                cnt=0;
                
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int testn = 1;
        while (t > 0) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", testn);
            Solution(n);
            testn++;
            t--;
            System.out.println();
        }
        
    }
}
