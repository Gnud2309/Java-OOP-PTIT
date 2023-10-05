package btcovananh.BaithucHanh1;

import java.util.Scanner;


class Fration{
    private long tuSo;
    private long mauSo;

    public Fration(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void rutGon() {
        long x = gcd(tuSo, mauSo);
        this.tuSo /= x;
        this.mauSo /=x;
    }

    public void sub(Fration f){
        this.tuSo=this.tuSo*f.mauSo - this.mauSo*f.tuSo;
        this.mauSo=this.mauSo*f.mauSo;
        rutGon();
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

}
public class bai1hieu2phanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fration a =new Fration(sc.nextLong(),sc.nextLong());
        Fration b = new Fration(sc.nextLong(),sc.nextLong());
        a.sub(b);
        if(a.getTuSo() == 0) System.out.println("0");
        else
            System.out.println(a);
    }
}

