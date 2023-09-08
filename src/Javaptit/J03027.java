package javaapplication11;

import java.util.Scanner;
import java.util.Stack;
public class J03027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack st = new Stack();

        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty() && s.charAt(i) == (char) st.peek()){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        if (st.isEmpty()) {
            System.out.println("Empty String");
        } else {
            while(!st.isEmpty()){
                System.out.println(st.pop());
            }
        }
    }
}
