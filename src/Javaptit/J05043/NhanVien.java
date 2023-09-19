package Javaptit.J05043;

public class NhanVien {
    private String ma,ten,chucvu;
    private int luongcb,songay,phucap,luongchinh,thunhap;
    private double tamung,conlai;
    public NhanVien(int ma, String ten, String chucvu, int luongcb, int songay) {
        this.ma = String.format("NV%02d", ma);
        this.ten = ten;
        this.chucvu = chucvu;
        this.luongcb = luongcb;
        this.songay = songay;
        if(chucvu.equals("GD")) phucap=500;
        else if(chucvu.equals("PGD")) phucap=400;
        else if(chucvu.equals("TP")) phucap=300;
        else if(chucvu.equals("KT")) phucap=250;
        else phucap=100;
        luongchinh = luongcb*songay;
        thunhap = luongchinh+phucap;
        double a = (double) ((luongchinh)*2/3);
        if(a<25000){
            tamung = Math.round(a/1000)*1000;
        }
        else tamung=25000;
        conlai=thunhap-tamung;
    }

    public String getChucvu() {
        return chucvu;
    }

    @Override
    public String toString(){
        return ma +" "+ten+" "+phucap+" "+luongchinh+" "+String.format("%.0f", tamung)+" "+String.format("%.0f", conlai);
    }
}
