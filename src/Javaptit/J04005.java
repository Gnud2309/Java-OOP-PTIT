package Javaptit;

import  java.util.*;

class ThiSinh{
    private String name,birth;
    private float diemMon1,diemMon2,diemMon3;

    public ThiSinh(){
        name = "";
        birth = "";
        diemMon2 = diemMon1 = diemMon3 =0;
    }

    public ThiSinh(String name, String birth, float diemMon1, float diemMon2, float diemMon3) {
        this.name = name;
        this.birth = birth;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    @Override
    public String toString() {
        return name + " " + birth + " " + String.format("%.1f%n", diemMon1 + diemMon2 + diemMon3);
    }
}

public class J04005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh x = new ThiSinh(name,birth,diem1,diem2,diem3);
        System.out.println(x);
    }
}
