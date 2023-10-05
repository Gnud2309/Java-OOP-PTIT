package Javaptit.J05051;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, loaiKH;
    private int heSo, chiSoCu, chiSoMoi, thanhTien;
    private double phuTroi;

    public KhachHang(String maKH, String loaiKH, int chiSoCu, int chiSoMoi) {
        this.ma = maKH;
        this.loaiKH = loaiKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        setHeSo();
        setThanhTien();
        setPhuTroi();
    }

    private void setHeSo() {
        if (loaiKH.equals("KD")) heSo = 3;
        else if (loaiKH.equals("NN")) heSo = 5;
        else if (loaiKH.equals("TT")) heSo = 4;
        else if (loaiKH.equals("CN")) heSo = 2;
    }

    private void setThanhTien() {
        thanhTien = (chiSoMoi - chiSoCu) * heSo * 550;
    }

    private void setPhuTroi() {
        int tru = chiSoMoi - chiSoCu;
        if (tru < 50) phuTroi = 0;
        else if (tru <= 100) phuTroi = Math.round(thanhTien * 35) / 100.0;
        else phuTroi = thanhTien;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public double getPhuTroi()   {
        return phuTroi;
    }

    public int compareTo(KhachHang o) {
        return Double.compare(o.getPhuTroi() + o.getThanhTien(), this.getPhuTroi() + this.getThanhTien());
    }

    @Override
    public String toString() {
        return ma + " " + heSo + " " + thanhTien + " " + Math.round(phuTroi) + " " + Math.round(phuTroi + thanhTien);
    }
}
