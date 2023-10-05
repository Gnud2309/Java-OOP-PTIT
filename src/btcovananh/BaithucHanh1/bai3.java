package btcovananh.BaithucHanh1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class XuLyDaySo {
    private int[] daySo;
    private int length;

    public void nhapDaySo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của dãy số: ");
        length = sc.nextInt();
        daySo = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            daySo[i] = sc.nextInt();
        }
    }

    public int timViTriSoNhoNhat() {
        if (length == 0) {
            return -1;
        }

        int min = daySo[0];
        int viTri = 0;
        for (int i = 1; i < length; i++) {
            if (daySo[i] < min) {
                min = daySo[i];
                viTri = i;
            }
        }
        return viTri;
    }

    public int tinhTong() {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += daySo[i];
        }
        return sum;
    }

    public void hienThiCapPhanTuCoHieuNhoHonK(int k) {
        boolean found = false;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Math.abs(daySo[i] - daySo[j]) < k) {
                    System.out.println("(" + daySo[i] + ", " + daySo[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Không có cặp phần tử có hiệu nhỏ hơn " + k);
        }
    }
}

class XuLyHoTen {
    public boolean kiemTraHoTen(String hoTen) {
        return hoTen.matches("^[a-zA-Z\\s]+$");
    }

    public static int tinhTuoi(String ngaySinh) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinhDate;
        try {
            ngaySinhDate = sdf.parse(ngaySinh);
            Date ngayHienTai = new Date();
            int tuoi = ngayHienTai.getYear() - ngaySinhDate.getYear();
            return tuoi;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Trả về -1 nếu có lỗi xảy ra trong quá trình xử lý
        }
    }
}

class XuLyMaTran {
    public void nhapMaTran(int[][] maTran) {
        Scanner sc = new Scanner(System.in);
        int n = maTran.length;
        System.out.println("Nhập giá trị cho ma trận " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maTran[i][j] = sc.nextInt();
            }
        }
    }

    public void hienThiHangGomToanSoChan(int[][] maTran) {
        boolean found = false;
        int n = maTran.length;
        for (int i = 0; i < n; i++) {
            boolean isAllEven = true;
            for (int j = 0; j < n; j++) {
                if (maTran[i][j] % 2 != 0) {
                    isAllEven = false;
                    break;
                }
            }
            if (isAllEven) {
                for (int j = 0; j < n; j++) {
                    System.out.print(maTran[i][j] + " ");
                }
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có hàng nào gồm toàn số chẵn.");
        }
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XuLyDaySo xuLyDaySo = new XuLyDaySo();
        XuLyHoTen xuLyHoTen = new XuLyHoTen();
        XuLyMaTran xuLyMaTran = new XuLyMaTran();

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập vào 1 dãy số nguyên dương");
            System.out.println("2. Viết ra vị trí của số nhỏ nhất đầu tiên của dãy");
            System.out.println("3. Viết ra tổng dãy");
            System.out.println("4. Viết ra các cặp phần tử có hiệu nhỏ hơn k");
            System.out.println("5. Nhập vào họ và tên ngày tháng năm sinh");
            System.out.println("6. Kiểm tra xem có đúng họ tên không");
            System.out.println("7. Viết ra tuổi");
            System.out.println("8. Nhập vào 1 ma trận vuông");
            System.out.println("9. Đưa ra các hàng gồm toàn số chẵn");
            System.out.println("0. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    xuLyDaySo.nhapDaySo();
                    break;
                case 2:
                    int viTriMin = xuLyDaySo.timViTriSoNhoNhat();
                    if (viTriMin != -1) {
                        System.out.println("Vị trí của số nhỏ nhất đầu tiên: " + (viTriMin + 1));
                    } else {
                        System.out.println("Dãy số rỗng.");
                    }
                    break;
                case 3:
                    int tong = xuLyDaySo.tinhTong();
                    System.out.println("Tổng của dãy số: " + tong);
                    break;
                case 4:
                    System.out.print("Nhập giá trị k: ");
                    int k = sc.nextInt();
                    xuLyDaySo.hienThiCapPhanTuCoHieuNhoHonK(k);
                    break;
                case 5:
                    sc.nextLine(); // Đọc bỏ dấu xuống dòng
                    System.out.print("Nhập họ và tên ngày tháng năm sinh: ");
                    String hoTenNgaySinh = sc.nextLine();
                    // Gọi các phương thức từ lớp XuLyHoTen
                    break;
                case 6:
                    sc.nextLine(); // Đọc bỏ dấu xuống dòng
                    System.out.print("Nhập họ và tên: ");
                    String hoTen = sc.nextLine();
                    boolean isValidHoTen = xuLyHoTen.kiemTraHoTen(hoTen);
                    if (isValidHoTen) {
                        System.out.println("Họ tên hợp lệ.");
                    } else {
                        System.out.println("Họ tên không hợp lệ.");
                    }
                    break;
                case 7:
                    // Nhập ngày tháng năm sinh
                    sc.nextLine(); // Đọc bỏ dấu xuống dòng
                    System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
                    String ngaySinh = sc.nextLine();

                    // Tính và hiển thị tuổi
                    int tuoi = XuLyHoTen.tinhTuoi(ngaySinh);
                    if (tuoi != -1) {
                        System.out.println("Tuổi của bạn là: " + tuoi + " tuổi.");
                    } else {
                        System.out.println("Ngày tháng năm sinh không hợp lệ.");
                    }
                    break;
                case 8:
                    System.out.print("Nhập kích thước ma trận vuông: ");
                    int size = sc.nextInt();
                    int[][] matrix = new int[size][size];
                    System.out.println("Nhập giá trị cho ma trận:");
                    // Đọc giá trị cho ma trận
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    // Gọi các phương thức từ lớp XuLyMaTran
                    break;
                case 9:
                    XuLyMaTran x = new XuLyMaTran();

                    // Nhập kích thước ma trận vuông
                    System.out.print("Nhập kích thước ma trận vuông (n): ");
                    int n = sc.nextInt();
                    int[][] maTran = new int[n][n];

                    // Nhập giá trị cho ma trận
                    System.out.println("Nhập giá trị cho ma trận:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            maTran[i][j] = sc.nextInt();
                        }
                    }

                    // Hiển thị các hàng gồm toàn số chẵn
                    System.out.println("Các hàng gồm toàn số chẵn:");
                    xuLyMaTran.hienThiHangGomToanSoChan(maTran);

                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        sc.close();
    }
}