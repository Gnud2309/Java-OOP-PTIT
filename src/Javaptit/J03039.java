package Javaptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            if(a.mod(b).intValue() == 0 || b.mod(a).intValue() == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
