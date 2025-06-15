package org.example;

import java.util.Scanner;

public class BaiTap {
    /* Viết chương trình cho phép người dùng nhập vào tên, lương 1 ngày, tổng số ngày làm và in kết quả ra màn hình.
    Ví dụ lương 1 ngày là 10đ làm 28 =>280đ */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập lương 1 ngày: ");
        int luong = scanner.nextInt();

        System.out.println("Nhập tổng số ngày làm việc: ");
        int ngay = scanner.nextInt();
        int sumLuong= luong*ngay;
        System.out.println("Nhân viên "+name+" có tổng lương là: "+sumLuong+"VNĐ");
    /* 1. Viết chương trình cho phép người dùng nhập vào số N. tính tổng từ 1-N */
        System.out.println("Nhập số N để tính tổng từ 1-N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến " + N + " là: " + sum);
//     2. Viết chương trình cho phép người dùng nhập vào số n. tính tổng số chẵn từ 0-n
        System.out.println("Nhập vào số n để tính tổng số chẵn từ 0-n");
        int n = scanner.nextInt();
        int sumSoChan = 0;
        for(int i =0; i<=n; i+=2){
            sumSoChan +=i;
        }
        System.out.println("Tổng chẵn từ 0 đến " + n + " là: " + sumSoChan);
        //chia hết cho 3 for(int i=3; i<=n; i+=3){}
    }
}
