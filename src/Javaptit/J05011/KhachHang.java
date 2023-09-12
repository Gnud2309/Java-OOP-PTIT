package Javaptit.J05011;

public class KhachHang implements Comparable<KhachHang> {
    private String ma,ten,gioVao,gioRa;
    private int soGio;

    public KhachHang(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        this.soGio = 60 * (Integer.parseInt(gioRa.substring(0, 2)) - Integer.parseInt(gioVao.substring(0, 2)))
                + (Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3)));
    }

    public String getSOGIO(){
        int h = soGio/60;
        int m = soGio%60;
        return String.format("%d gio %d phut",h,m);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+getSOGIO();
    }

    @Override
    public int compareTo(KhachHang o) {
        return -(this.soGio - o.soGio);
    }
}
