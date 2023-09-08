/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] isPrime = new boolean[2 * 1000007];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int[] prime = new int[2 * 1000007];
        int idx = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                prime[idx++] = i;
            }
        }
        
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < idx && prime[j] * prime[j] <= num; j++) {
                while (num % prime[j] == 0) {
                    sum += prime[j];
                    num /= prime[j];
                }
            }
            if (num > 1) {
                sum += num;
            }
            totalSum += sum;
        }
        
        System.out.println(totalSum);
    }}
