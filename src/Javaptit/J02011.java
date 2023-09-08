/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J02011 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        for(int i=0;i<n-1;i++){
            System.out.print("Buoc " + (i+1) +": ");
                int m=i;
                for(int j=i+1;j<n;j++){
                    if(arr.get(j)<arr.get(m)){
                        m=j;
                    }     
                }
                int tmp = arr.get(i);
                     arr.set(i,arr.get(m));
                     arr.set(m,tmp);
                for(int j : arr){
                    System.out.print(j + " ");
                }
                System.out.println();
        }
    }
}
