/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;

import java.util.*;

public class J02103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int k=0;
        while(t-- >0){
            k++;
            System.out.println("Test " +k+":");
            
            int n =sc.nextInt() ,m=sc.nextInt();
            int[][] arr = new int[n+4][m+4];
            int[][] hoanViArr = new int[n+4][m+4];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                    hoanViArr[j][i] = arr[i][j];
                }   
            }
            int[][] res = new int[n+4][m+4];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res[i][j] = 0;
                for(int z=0;z<m;z++){
                    res[i][j] += arr[i][z] * hoanViArr[z][j];
                }
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
            }
            
        }
    }
}
