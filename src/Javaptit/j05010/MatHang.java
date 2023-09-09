package Javaptit.j05010;

class MatHang implements Comparable<MatHang>{
    private int ma;
    private static int cnt = 1;
    private String ten, nhom;
    private float giaMua, giaBan, tienLoi;

    public MatHang(String ten, String nhom, float giaMua, float giaBan) {
        this.ma = cnt++;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.tienLoi = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+nhom+" "+String.format("%.2f", tienLoi);
    }


    @Override
    public int compareTo(MatHang o) {
        return -(Float.compare(this.tienLoi, o.tienLoi));
    }
}