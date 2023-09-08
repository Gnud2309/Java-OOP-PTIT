package javaapplication11;


import java.util.Scanner;

class GiaoVien{
    private String id,name;
    private int luongBasic,phuccap,bacluong;

    public GiaoVien(String id, String name, int luongBasic) {
        this.id = id;
        this.name = name;
        this.luongBasic = luongBasic;

        bacluong = Integer.parseInt(id.substring(2));
        if(id.substring(0,2).equals("HT")){
            phuccap = 2000000;
        }
        if(id.substring(0,2).equals("HP")){
            phuccap = 900000;
        }
        if(id.substring(0,2).equals("GV")){
            phuccap = 500000;
        }
    }
    public int TongLuong(){
        return luongBasic*bacluong+phuccap;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.bacluong+" "+this.phuccap+" "+this.TongLuong();
    }
}

public class J04015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.print(x);
    }
}
