package org.example;

import java.util.Scanner;

public class BaiTap2 {
    public static double payroll(int workdays, double dailyWage) {
        return workdays*dailyWage;
    }
    public static void main(String[] args) {
        //mô hình IPO
        //input
        //giá trị từ phía người dùng nhập
        Scanner scanner = new Scanner(System.in);

        // Nhập số ngày làm việc
        System.out.print("Nhập số ngày làm việc: ");
        int workingDays = scanner.nextInt();

        // Nhập số tiền 1 ngày
        System.out.print("Nhập số tiền 1 ngày: ");
        double dailyWage = scanner.nextDouble();

        //process
        //giá trị từ người dùng nhập đi thực hiện  logic yêu cầu của bài toán
        // Tính tiền lương
        double totalSalary = payroll(workingDays, dailyWage);

        //output //giá trị đầu ra của đề
        // Xuất kết quả
        System.out.printf("Tổng lương là: %.2f\n", totalSalary);
    }
}
/*Viết chương trình tính tiền lương cho phép người dùng nhập vào số ngày làm và số tiền 1 ngày.
* Biết tổng lương = số ngày làm*số tiền 1 ngày.
* tách hàm ra xử lý*/

