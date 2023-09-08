/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J02012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
            
            Collections.sort(arr);
            
            System.out.print("Buoc " + i + ": ");
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

