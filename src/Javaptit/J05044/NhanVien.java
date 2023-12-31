package Javaptit.J05044;

public class NhanVien {
    private String ma,ten,chucVu;
    private long luong,ngayCong,phuCap,luongCoBan,tamUng,conLai;

    public NhanVien(int stt, String ten, String chucVu, long luong, long ngayCong) {
        this.ma = "NV" + String.format("%02d",stt);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.luongCoBan = luong * ngayCong;
        if(this.chucVu.equals("GD")) this.phuCap = 500;
        else if(this.chucVu.equals("PGD")) this.phuCap = 400;
        else if(this.chucVu.equals("TP")) this.phuCap = 300;
        else if(this.chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;

        long a =((this.phuCap + this.luongCoBan)*2)/3;
        if(a < 25000) {
            this.tamUng = Math.round((double) a/1000)*1000;
        }
        else {
            this.tamUng = 25000;
        }

        this.conLai = this.luongCoBan + this.phuCap - this.tamUng;
    }

    public String getChucVu() {
        return this.chucVu;
    }

    @Override
    public String toString() {
        return this.ma+" "+ this.ten+" "+this.phuCap+" "+this.luongCoBan+" "+this.tamUng+" "+this.conLai;
    }
}
