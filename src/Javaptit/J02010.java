/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class J02010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        for (int i=0;i<n-1;i++){
            System.out.print("Buoc " + (i+1) + ": " );
            
            for(int j=i+1;j<n;++j){
                if(arr.get(i) > arr.get(j)){
                    int tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
            for(int j : arr){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
