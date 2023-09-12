package Javaptit.J05025;

public class GiangVien {
    private static int cnt =1;
    private String ma,ten,boMon;

    public GiangVien(String ten, String boMon) {
        this.ma = String.format("GV%02d",cnt++);
        this.ten = ten;
        String[] word = boMon.split("\\s+");
        String tmp = "";
        for(int i=0;i< word.length;i++){
            tmp += word[i].substring(0,1).toUpperCase();
        }
        this.boMon = tmp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+boMon;
    }
}
