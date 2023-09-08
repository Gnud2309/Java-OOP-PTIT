/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J02006 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Set<Integer> seA = new HashSet<>();
        Set<Integer> seB = new HashSet<>();
        
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            seA.add(num);
        }
        for(int i=0;i<m;i++){
            int num =sc.nextInt();
            seB.add(num);
        }
        
        Set<Integer> union = new TreeSet<>(seA);
        union.addAll(seB);
        
        for(int num : union){
            System.out.print(num + " ");
        }      
    }  
}
