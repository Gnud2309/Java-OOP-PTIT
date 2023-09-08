package javaapplication11;

import java.math.BigInteger;
import java.util.Scanner;

public class J03024 {

    static String check(String s){

        BigInteger biger = new BigInteger(s.substring(0,1));
        if(biger.equals(BigInteger.ZERO)){
            return "NO";
        }
        int cnt =0;
        for(int i = 0;i < s.length()-1; i++){
            cnt += s.charAt(i) & 1;
        }
        if ((s.length() % 2) == 1 && cnt > s.length() / 2) {
            return "YES";
        } else if ((s.length() % 2) == 0 && cnt < s.length() / 2) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            try{
                BigInteger a = new BigInteger(s);
                System.out.println(check(s));
            }
            catch (Exception e){
                System.out.println("INVALID");
            }
        }
    }


}
