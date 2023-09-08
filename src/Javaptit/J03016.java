package javaapplication11;


import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        BigInteger n = new BigInteger("11");
        while(t-- >0){
            BigInteger a =  sc.nextBigInteger();
            BigInteger b = a.divide(n);
            if(b.multiply(n).compareTo(a) == 0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
