package Javaptit.J05040;

public class NhanVien {
    private String ma, ten, chucVu;
    private int luongCB, ngayCong;

    public NhanVien(String ma, String ten, int luongCB, int ngayCong, String chucVu) {
        this.ma = ma;
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
    }

    public int luongThang() {
        return luongCB * ngayCong;
    }

    public int thuNhap() {
        if (ngayCong >= 25) {
            return (int) (luongThang() * 0.2);
        } else if (ngayCong >= 22) {
            return (int) (luongThang() * 0.1);
        } else {
            return 0;
        }
    }

    public int phuCap() {
        switch (chucVu) {
            case "GD":
                return 250000;
            case "PGĐ":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }

    public int tongLuong() {
        return luongThang() + thuNhap() + phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang() + " " + thuNhap() + " " + phuCap() + " " + tongLuong();
    }
}