package Javaptit.J05030;

public class SinhVien {

    private String ma,ten,lop;
    private float diem1,diem2,diem3;

    public SinhVien(String ma, String ten, String lop, float diem1, float diem2,float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + String.format("%.1f %.1f %.1f", diem1, diem2, diem3);
    }
}
