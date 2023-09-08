/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J03004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s =sc.nextLine();
            String[] words = s.split(" ");
            for(String x : words){
                if(!x.isEmpty()){
                    x = x.substring(0,1).toUpperCase() +x.substring(1).toLowerCase();
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
