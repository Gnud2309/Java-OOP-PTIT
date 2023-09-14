package Javaptit.J05037;

public class QuanLy{
    private String ma, tenHang, doiVi;
    private long giaNhap, soLuong;

    public QuanLy(String ma, String tenHang, String doiVi, long giaNhap, long soLuong) {
        this.ma = ma;
        this.tenHang = tenHang;
        this.doiVi = doiVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    private long giaVanChuyen() {
        return Math.round(1.0 * (giaNhap * soLuong) * 5 / 100);
    }

    private long thanhTien() {
        return Math.round(1.0 * (giaNhap * soLuong) + giaVanChuyen());
    }

    public long giaBan() {
        double tmp = (thanhTien() + thanhTien() * 2.0 / 100) / soLuong;
        return (long) (Math.ceil(tmp / 100) * 100);
    }

    public long getGiaVanChuyen() {
        return giaVanChuyen();
    }

    public long getThanhTien() {
        return thanhTien();
    }

    public String toString() {
        return ma + " " + tenHang + " " + doiVi + " " + getGiaVanChuyen() + " " + getThanhTien() + " " + giaBan();
    }
}
