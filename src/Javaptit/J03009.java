/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.*;
public class J03009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] list1 = s1.split("\\s+");
            String[] list2 = s2.split("\\s+");
            Set<String> se = new TreeSet<>();
            for (String i : list1)
                if (!Arrays.asList(list2).contains(i))
                    se.add(i);
             for (String i : se)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
