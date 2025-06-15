package org.example;

import java.util.Scanner;

public class DTB {
    /*Viết chương trình nhập điểm toán lý hóa, tính trung bình và in ra màn hình*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán: ");
        float diemToan = scanner.nextFloat();
        System.out.println("Nhập vào điểm môn Lý: ");
        float diemLy = scanner.nextFloat();
        System.out.println("Nhập vào điểm môn Hóa: ");
        float diemHoa = scanner.nextFloat();

        float diemTB =(diemToan+diemLy+diemHoa)/3;
        System.out.format("Điểm trung bình 3 môn Toán, Lý, Hóa là: %.1f",diemTB);


    }
}
