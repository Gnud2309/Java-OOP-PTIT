package Javaptit.J05032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nguoi> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
         while(t-- >0){
             String s = sc.nextLine();
             String[] a = s.split("\\s+");
             arr.add(new nguoi(a[0],a[1]));
         }

        Collections.sort(arr, new Comparator<nguoi>() {
            @Override
            public int compare(nguoi o1, nguoi o2) {
                return o2.chuanHoa(o2.getBirth()).compareTo(o1.chuanHoa(o1.getBirth()));
            }
        });

        System.out.println(arr.get(0).getName());
        System.out.println(arr.get(arr.size() -1).getName());
    }
}
