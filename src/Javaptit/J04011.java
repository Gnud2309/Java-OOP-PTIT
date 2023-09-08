package Javaptit;

import java.util.Scanner;

class Point3D{
    private int  x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        // Tạo các vector AB AC AD
        Point3D AB = new Point3D(B.x - A.x, B.y - A.y, B.z - A.z);
        Point3D AC = new Point3D(C.x - A.x, C.y - A.y, C.z - A.z);
        Point3D AD = new Point3D(D.x - A.x, D.y - A.y, D.z - A.z);
        // Tính tích 2 vector AB, AC để tạo được vector ABAC
        Point3D ABAC = new Point3D(AB.y * AC.z - AB.z * AC.y, AB.z * AC.x - AB.x * AC.z, AB.x * AC.y - AB.y * AC.x);
        int S = (ABAC.x * AD.x) + (ABAC.y * AD.y) + (ABAC.z * AD.z); // Kiểm tra xem điểm D có nằm trên mặt phẳng không nếu có thì trả S bằng 0
        return S == 0;
    }
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
