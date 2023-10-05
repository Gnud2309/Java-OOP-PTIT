package Javaptit.J05047;

import java.util.HashMap;
import java.util.Map;

public class MatHang implements Comparable<MatHang> {
    private String ma,ten;
    private int soLuong,donGia;
    public static Map<String,Integer> map;

    public static void KhoiTaomap(){
        MatHang.map = new HashMap<>();
    }

    public MatHang(String ten, int soLuong, int donGia) {

        String[] arr = ten.trim().split("\\s+");
        String tmp = "" + Character.toUpperCase(arr[0].charAt(0)) +Character.toUpperCase(arr[1].charAt(0));
        if(map.containsKey(tmp)){
            int d = map.get(tmp);
            this.ma = tmp + String.format("%02d",d);
            map.put(tmp,d+1);
        }
        else {
            this.ma = tmp + String.format("%02d",1);
            map.put(tmp,2);
        }
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public float ChietKhau(){
        if(soLuong>10) return  0.05f;
        if(soLuong>7) return 0.02f;
        if(soLuong>4) return 0.01f;
        return 0;
    }

    public int TienChietKhau(){
        return (int) (this.donGia*this.soLuong*this.ChietKhau());
    }

    public int ThanhTien(){
        return (int) (this.donGia*this.soLuong - this.TienChietKhau());
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.TienChietKhau()+" "+this.ThanhTien();
    }

    @Override
    public int compareTo(MatHang o) {
        return -Integer.compare(this.TienChietKhau(),o.TienChietKhau());
    }
}
