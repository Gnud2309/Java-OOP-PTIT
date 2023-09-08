/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.*;

public class J02105 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int j=0;j<n;j++){
                int value = sc.nextInt();
                if(value == 1 ){
                    arr1.add( j+1);
                }
            }
            arr.add(arr1);
        }
        
        for(int i=0;i<n;i++){
            System.out.print("List(" + (i+1) + ") = " );
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j));
                if(j < arr.get(i).size() - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
    }
}
