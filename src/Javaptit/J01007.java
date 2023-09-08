/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaptit;
import java.util.Arrays;
import java.util.Scanner;
public class J01007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
            long[] f = new long[94];
            f[1]=f[2] = 1;
            for(int i=3;i<=93;++i){
                f[i]=f[i-1]+f[i-2];
            }
            while(t>0){
                int n = sc.nextInt();
                int index = Arrays.binarySearch(f,1,93,n);
                if(index<0) System.out.println("NO");
                else System.out.println("YES");
                t--;
            }
    }
}
