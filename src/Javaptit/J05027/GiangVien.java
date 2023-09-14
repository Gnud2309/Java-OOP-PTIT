package Javaptit.J05027;

public class GiangVien {
    private String ma,ten,boMon;
    private static int cnt=1;

    public GiangVien(String ten, String boMon) {
        this.ma = String.format("GV%02d",cnt++);
        this.ten = ten;
        this.boMon = "";
        String[] arr = boMon.split("\\s+");
        for(String x : arr){
            this.boMon += Character.toUpperCase(x.charAt(0));
        }
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+boMon;
    }
}

