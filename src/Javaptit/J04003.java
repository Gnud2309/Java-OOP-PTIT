package Javaptit;

import java.util.Scanner;

class Fraction{
    private long numerator,denominator;

    Fraction(){
        numerator = 0;
        denominator = 1;
    }
    public Fraction(long numerator, long denominator) {
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

public class J04003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Fraction x = new Fraction(a,b);
        System.out.print(x);
    }
}
