/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.Scanner;
public class J01009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sumKetQua = 1;
        long sum = 0;
        for(int i=1;i<=n;i++){
            sumKetQua *=i;
            sum +=sumKetQua;
        }
        System.out.println(sum);
        
    }
}
