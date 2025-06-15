package org.example;

import java.util.Scanner;

/* Viết chương trình nhập vào thông tin tiêu thụ điện ((Tên, số Kw)
 * Tính và xuất tiền trả theo quy tắc
 * 50kw đầu: 500đ/kw 50 kw
 * 50kw kế: 650đ/kw  100 kw
 * 100kw kế 850đ/kw 200kw
 * 150 kế: 1100đ/kw 350kw
 * Còn lại: 1300đ/kw */
public class tinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng: ");
        String tenKH = scanner.nextLine();
        System.out.println("Nhập số Kwh tiêu thụ: ");
        double soKw = scanner.nextDouble();
        double thanhTien = 0;

        if (soKw <= 50) {
            thanhTien = soKw * 500;
        } else if (soKw <= 100) { // Từ 51 đến 100 KW
            thanhTien = (50 * 500) + ((soKw - 50) * 650);
        } else if (soKw <= 200) { // Từ 101 đến 200 KW
            thanhTien = (50 * 500) + (50 * 650) + ((soKw - 100) * 850);
        } else if (soKw <= 350) { // Từ 201 đến 350 KW
            thanhTien = (50 * 500) + (50 * 650) + (100 * 850) + ((soKw - 200) * 1100);
        } else { // Trên 350 KW
            thanhTien = (50 * 500) + (50 * 650) + (100 * 850) + (150 * 1100) + ((soKw - 350) * 1300);
        }

        System.out.println("\n--- Hóa đơn tiền điện ---");
            System.out.println("Tên khách hàng: " + tenKH);
            System.out.println("Số KW tiêu thụ: " + soKw + " KW");
            System.out.format("Tổng tiền phải trả: %.0f vnđ\n", thanhTien);
    }
}
