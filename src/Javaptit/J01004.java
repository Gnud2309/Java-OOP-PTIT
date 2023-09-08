package Javaptit;

import java.util.Scanner;

public class J01004 {

    static String isPrime(int n) {
        if (n < 2) {
            return "NO";
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(isPrime(n));
            t--;
        }
        sc.close();
    }
}
