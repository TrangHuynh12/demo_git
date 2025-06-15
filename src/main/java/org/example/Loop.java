package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
////        vòng lặp while
////        Yêu cầu: In 5 dòng hello world
//        int i = 1; // giá trị ban đầu
//        while (i <= 5) { // điều kiện thực hiện vòng lặp
//            System.out.println("Hello world!"); // thực hiện yêu cầu
//            i++; //i = i+1 or i += 1 thay đổi giá trị ban đầu
//        }
////        Yêu cầu: Viết chương trình cho phép người dùng nhập số n, in ra giao diện n lần dòng Hello Testing 05
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lần in: ");
//        int n = scanner.nextInt();
//        int j =1;
//        while (j<=n){
//            System.out.println("Hello Testing 05");
//            j++;
//        }

        /* vòng lặp do while
         * giá trị ban đầu
         * do{
         * thực hiện logic
         * làm thay đổi giá trị ban đầu
         * } while*/
        int index = 1;
        do {
            System.out.println("Giá trị i: " + index);
            index++;
        } while (index <= 5);

        /*vòng lặp for
         * for(giá trị khởi tạo; điều kiên; cập nhật giá trị khởi tạo
         */
        for(int i=1; i<=5; i++){
            System.out.println("Giá trị i: " +i);
        }
    }
}
