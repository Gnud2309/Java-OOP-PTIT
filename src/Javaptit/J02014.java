/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.*;

public class J02014 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sum = new int[n];
            a[0] = sc.nextInt();
            sum[0] = a[0];
            for (int i = 1; i < n; ++i)
            {
                a[i] = sc.nextInt();
                sum[i] = sum[i - 1] + a[i];
            }
            int idx = -1;
            for (int i = 0; i < n; ++i)
            {
                if (sum[i] - a[i] == sum[n - 1] - sum[i])
                {
                    idx = i + 1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}

