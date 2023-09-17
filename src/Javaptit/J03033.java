/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.math.BigInteger;
import java.util.*;

public class J03033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();
            System.out.println(n1.multiply(n2).divide(n1.gcd(n2)));
        }
    }
}
