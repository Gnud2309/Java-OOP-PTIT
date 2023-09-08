/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J02007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            int n = sc.nextInt();
            
            Map<Integer,Integer> mp = new LinkedHashMap<>();
            List<Integer> ip = new ArrayList<>();
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                mp.put(num,mp.getOrDefault(num, 0) +1);
                if (!ip.contains(num)) {
                    ip.add(num);
                }
            }
            System.out.println("Test " + j + ":");
            for(int num : ip){
                System.out.println(num + " xuat hien " + mp.get(num) + " lan" );
            }
            ip.clear();
        }   
    }
}
