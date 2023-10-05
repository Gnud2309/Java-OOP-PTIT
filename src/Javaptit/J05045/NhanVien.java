package Javaptit.J05045;


public class NhanVien {
    private String ma,ten,chucVu;
    private long luong,ngayCong,phuCap,thuNhap,tamUng,conLai;

    public NhanVien(int stt, String ten, String chucVu, long luong, long ngayCong) {
        this.ma = "NV" + String.format("%02d",stt);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.thuNhap = luong*ngayCong;

        if(this.chucVu.equals("GD")) this.phuCap = 500;
        else if(this.chucVu.equals("PGD")) this.phuCap = 400;
        else if(this.chucVu.equals("TP")) this.phuCap = 300;
        else if(this.chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;

        long a = ((this.thuNhap+this.phuCap)*2)/3;

        if(a<25000){
            this.tamUng = Math.round((double) a/1000)*1000;
        }
        else  this.tamUng = 25000;

        this.conLai = this.thuNhap+this.phuCap - this.tamUng;
    }

    public long getThuNhap() {
        return this.thuNhap +this.phuCap;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.phuCap+" "+this.thuNhap+" "+this.tamUng+" "+this.conLai;
    }
}
