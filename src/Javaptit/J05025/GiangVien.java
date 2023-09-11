package Javaptit.J05025;

public class GiangVien implements Comparable<GiangVien> {
    private static int cnt =1;
    private String ma,ten,boMon;

    public GiangVien(String ma, String ten, String boMon) {
        this.ma = String.format("GV%02d",cnt++);
        this.ten = ten;
        this.boMon = boMon;
    }



    @Override
    public int compareTo(GiangVien o) {
        return 0;
    }
}
