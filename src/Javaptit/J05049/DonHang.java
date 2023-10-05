package Javaptit.J05049;

public class DonHang {
    private String maHang;
    private int soLuongNhap, soLuongXuat, donGia, tien, thue;

    public DonHang(String maHang, int soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
        setDonGia();
        setSoLuongXuat();
        setTien();
        setThue();
    }

    private void setSoLuongXuat() {
        if (maHang.startsWith("A")) {
            this.soLuongXuat = (int) Math.round(soLuongNhap * 0.6);
        } else if (maHang.startsWith("B")) {
            this.soLuongXuat = (int) Math.round(soLuongNhap * 0.7);
        }
    }

    private void setDonGia() {
        if (maHang.endsWith("Y")) {
            this.donGia = 110000;
        } else if (maHang.endsWith("N")) {
            this.donGia = 135000;
        }
    }

    private void setTien() {
        this.tien = soLuongXuat * donGia;
    }

    private void setThue() {
        double thuePercent = 0.0;
        if (maHang.startsWith("A")) {
            thuePercent = maHang.endsWith("Y") ? 0.08 : 0.11;
        } else if (maHang.startsWith("B")) {
            thuePercent = maHang.endsWith("Y") ? 0.17 : 0.22;
        }
        this.thue = (int) Math.round(tien * thuePercent);
    }

    public int getThue() {
        return thue;
    }

    public String getMaHang() {
        return maHang;
    }

    @Override
    public String toString() {
        return maHang + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }
}
