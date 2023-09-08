package Javaptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class ThoiGian implements Comparable<ThoiGian>{
    private int gio,phut,giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio+ " " +phut+ " " +giay;
    }

    @Override
    public int compareTo(ThoiGian o) {
        if(this.gio !=o.gio)
            return this.gio - o.gio;
        else if (this.phut != o.phut) {
            return this.phut - o.phut;
        }
        return this.giay - o.giay;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <ThoiGian> arr = new ArrayList<>();
        while(t-- >0){
            arr.add(new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(arr);
        for(ThoiGian i : arr)
            System.out.println(i);
    }
}
