package Javaptit.J05048;

public class DonHang {
    private String ma;
    private long soLuongNhap;
    private double soLuongXuat, donGia, tien, thue;


    public DonHang(String ma, long soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        if (ma.startsWith( "A")) {
            soLuongXuat = Math.round(soLuongNhap/100.0*60);
        }
        else if (ma.startsWith( "B")) {
            soLuongXuat = Math.round(soLuongNhap/100.0*70);
        }
        if (ma.endsWith("Y")) {
            donGia = 110000;
        } else if(ma.endsWith("N")) {
            donGia = 135000;
        }
        tien =donGia*soLuongXuat;
        if (ma.startsWith( "A") && ma.endsWith("Y")) {
            thue = tien/100.0*8;
        }
        else if(ma.startsWith( "A") && ma.endsWith("N")){
            thue = tien/100.0*11;
        }
        if (ma.startsWith( "B") && ma.endsWith("Y")) {
            thue = Math.round(tien/100.0*17);
        }
        else if (ma.startsWith( "B") && ma.endsWith("N")) {
            thue = Math.round(tien/100.0*22);
        }
    }

    public double getThue() {
        return thue;
    }

    public double setTien() {
        return donGia*soLuongXuat;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.soLuongNhap+" "+String.format("%.0f",soLuongXuat)
                +" "+String.format("%.0f",donGia)+" "+String.format("%.0f",setTien())
                +" "+String.format("%.0f",thue);
    }
}
