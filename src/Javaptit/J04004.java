package javaapplication11;

import java.util.Scanner;

class PhanSo{
    private long numerator,denominator;

    PhanSo(){
        numerator = 0;
        denominator = 1;
    }
    public PhanSo(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private long gcd(long x, long y) {
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    @Override
    public String toString() {
        long chia = gcd(this.numerator,this.denominator);
        return numerator/chia +"/" +denominator/chia;
    }
}

public class J04004 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo x = new PhanSo(a * d + c * b, b * d);
        System.out.println(x);
    }
}
