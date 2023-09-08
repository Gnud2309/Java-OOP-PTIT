/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.*;

public class J02020 {
    
   static int n,k,cnt=0;
   static int[] arr = new int[100000];
   
   static void Try1(int i){
       for(int j=arr[i-1]+1;j<=n;j++){
           arr[i]=j;
           if(i==k){
               for(int x =1;x<=k;x++) System.out.print(arr[x] + " ");
               System.out.println();
               cnt++;
           }
           else Try1(i+1);
       }
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       k = sc.nextInt();
       Try1(1);
       System.out.print("Tong cong co " + cnt + " to hop");
   }
}
