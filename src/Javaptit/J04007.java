package Javaptit;
import java.util.Scanner;

class NhanVien{

    private String id,name,sex,birth,address,mathue,hopdong;

    public NhanVien(String id, String name, String sex, String birth, String address, String mathue, String hopdong) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.mathue = mathue;
        this.hopdong = hopdong;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.birth + " " + this.address + " " + this.mathue + " " + this.hopdong;
    }
}

public class J04007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("00001",sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(x);
    }
}
