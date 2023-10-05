package Javaptit;

import java.util.Scanner;

public class ChiaHet {
    private long tuSo;
    private long mauSo;

    public ChiaHet(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private long timUCLN(long a, long b) {
        if (b == 0) {
            return a;
        }
        return timUCLN(b, a % b);
    }

    public void rutGon() {
        long ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    @Override
    public String toString() {
        return tuSo + " / " + mauSo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long tuSoP = sc.nextLong();
        long mauSoP = sc.nextLong();
        long tuSoQ = sc.nextLong();
        long mauSoQ = sc.nextLong();

        if (mauSoP == 0 || mauSoQ == 0) {
            System.out.println("-1");
        } else {
            ChiaHet p = new ChiaHet(tuSoP, mauSoP);
            ChiaHet q = new ChiaHet(tuSoQ, mauSoQ);

            p.rutGon();
            q.rutGon();

            p.tuSo *= q.mauSo;
            p.mauSo *= q.tuSo;

            p.rutGon(); // Rút gọn kết quả

            System.out.println(p);
        }
    }
}



//package thuchanh;
//
//        import java.util.Scanner;
//
//class Sinhvien{
//    private String id ,name ;
//    private boolean gt;
//    private double bd;
//
//    public Sinhvien() {
//    }
//
//    public void input(){
//        Scanner sc =new Scanner(System.in);
//        this.id =sc.nextLine();
//        this.name=sc.nextLine();
//        this.gt =Boolean.parseBoolean(sc.nextLine());
//        this.bd =Double.parseDouble(sc.nextLine());
//
//    }
//    public String diem(){
//        if(bd>=5) return "dat";
//        else return "hoc lai";
//    }
//    public void chuanHoa(){
//        this.id =this.id.toUpperCase();
//    }
//    public void out(){
//        chuanHoa();
//        System.out.print(id+" "+name+" "+(gt ?"nam":"nu")+" ");
//        System.out.print(diem());
//
//    }
//
//}
//public class TaoLopSinhVien {
//    public static void main(String[] args) {
//        Sinhvien sv=new Sinhvien();
//        //input
//        sv.input();
//        //output
//        sv.out();
//
//    }
//
//}