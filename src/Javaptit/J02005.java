/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class J02005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int num =sc.nextInt();
            mapA.put(num,mapA.getOrDefault(num,0) +1);
        }
        
        for(int i=0;i<m;i++){
            int num =sc.nextInt();
            mapB.put(num,mapB.getOrDefault(num,0) +1);
        }
        Set<Integer> intersection = new TreeSet<>();
        for (int num : mapA.keySet()) {
            if (mapB.containsKey(num)) {
                intersection.add(num);
            }
        }

        for (int num : intersection) {
            System.out.print(num + " ");
        } 
    }
}
