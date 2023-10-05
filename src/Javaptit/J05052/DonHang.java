package Javaptit.J05052;

public class DonHang {
    private String tenHang,maHang,stt;
    private long soLuong,thanhtien,donGia;

    public DonHang(String tenHang, String maHang, long donGia, long soLuong) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.donGia = donGia;
        this.stt = maHang.substring(1,4);
        this.soLuong = soLuong;
        this.thanhtien = (soLuong*donGia) - getgiamGia();
    }




    public long getgiamGia() {
        if (maHang.endsWith("2")) {
            return Math.round(((double) (soLuong*donGia * 3) / 10));
        } else {
            return Math.round(((double) (soLuong*donGia * 5) / 10));
        }
    }

    @Override
    public String toString() {
        return this.tenHang+" "+this.maHang+" "+this.stt+" "+this.getgiamGia()+" "+this.thanhtien;
    }
}
