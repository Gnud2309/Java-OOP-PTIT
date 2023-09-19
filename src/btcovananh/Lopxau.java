package btcovananh;

import java.util.Scanner;
import java.util.regex.*;
public class Lopxau {
    private String maHoaDon;

    public Lopxau(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public boolean kiemTraMaHoaDon() {
        String pattern = "^(N|X)\\d{4}\\d{3}$";

        if (maHoaDon.matches(pattern)) {
            // Lấy năm hiện tại
            int currentYear = java.time.Year.now().getValue(); //thoigianthuc
            int maHoaDonYear = Integer.parseInt(maHoaDon.substring(1, 5)); //nam 4 so dau

            if (maHoaDonYear >= 2000 && maHoaDonYear <= currentYear) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Lopxau lopxau1 = new Lopxau(s); //"N222999"

        System.out.println(lopxau1.kiemTraMaHoaDon());
    }
}
