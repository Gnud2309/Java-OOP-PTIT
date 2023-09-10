package Javaptit.J05018;

public class HocSinh implements Comparable<HocSinh> {
    public static int cnt =1;
    private String ma,ten;
    private Float tongDiem;

    public HocSinh(String ten, Float[] diem) {
        this.ma = String.format("HS%02d",cnt++);
        this.ten = ten;
        tongDiem =0f;
        for(int i=0;i<10;i++){
            tongDiem += diem[i] * ((i==0||i==1) ? 2f : 1f);
        }
        tongDiem /= 12f;
        tongDiem = Math.round(tongDiem *10f)/10f;
    }




    private String xepLoai(){
        if(tongDiem>=9){
            return "XUAT SAC";
        }
        if(tongDiem>=8){
            return "GIOI";
        }
        if(tongDiem>=7){
            return "KHA";
        }
        if(tongDiem>=5){
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.1f",tongDiem)+" "+xepLoai();
    }

    @Override
    public int compareTo(HocSinh o) {
        if(tongDiem.compareTo(o.tongDiem) == 0){
            return this.ma.compareTo(o.ma);
        }
        return -this.tongDiem.compareTo(o.tongDiem);
    }
}
