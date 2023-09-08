package javaapplication11;

import java.util.Scanner;

public class J03025 {

    static String rev(String s){
        int cnt = 0;
        for(int i = 0; i < s.length()/2 && cnt <=1 ;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                cnt ++;
        }
        if(s.length() %2 ==1 && cnt <=1) return "YES";
        else if(s.length() % 2 == 0 && cnt ==1) return "YES";
        return "NO";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            System.out.println(rev(sc.nextLine()));
        }
    }
}
