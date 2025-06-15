package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        /* Câu lệnh if
        if(điều kiện){thực hiện logic}
        Viết chương trình kiểm tra xem hôm nay có phải đi học không?*/
        int day = 4;
        if (day == 4 || day == 8) {
            System.out.println("Hôm nay đi học!");
        }
        /* if-else
        if(đk){thực hiện logic1} else {logic2}*/
        int a = 8;
        int b = 10;
        if (a > b) {
            System.out.println("Số a lớn hơn số b");
        } else {
            System.out.println("Số a nhỏ hơn số b");
        }


        /* Yêu cầu: Viết chương trình cho phép người dùng nhập vào số tuổi kiểm tra xem đủ tuổi học đại học */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tuoi: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Du tuoi hoc Dai hoc");
        } else {
            System.out.println("Khong du tuoi hoc Dai hoc");
        }

//        Toán tử 3 ngôi -> đk?thực hiện logic 1: thực hiện logic 2
        String result = (age >= 18) ? ("Du tuoi hoc Dai hoc") : ("Khong du tuoi hoc Dai hoc");
        System.out.println(result);
//        if (điều kiện1){thực hiện logic 1} else if (dk2) {thực hiện logic 2} else {logic3}
       /* Viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán, lý hoá, sau đó tính điểm trung bình.
        Nếu đtb:
        <5 -> hs yếu
        5.1-6: hs tb
        6.1-7: hs khá
        7.1-8: hs giỏi
        8.1-10: hs xs*/
        System.out.println("Nhập vào điểm môn Toán:");
        float diemToan = scanner.nextFloat();
        System.out.println("Nhập vào điểm môn Lý:");
        float diemLy = scanner.nextFloat();
        System.out.println("Nhập vào điểm môn Hóa:");
        float diemHoa = scanner.nextFloat();
        float diemTB = (diemToan + diemLy + diemHoa) / 3;
        System.out.format("Điểm trung bình 3 môn Toán, Lý, Hóa là: %.1f\n", diemTB);
        if (diemTB > 0 && diemTB <= 5) {
            System.out.println("Xếp loại: Yếu");
        } else if (diemTB >= 5.1 && diemTB <= 6) {
            System.out.println("Xếp loại: Trung bình");
        } else if (diemTB >= 6.1 && diemTB <= 7) {
            System.out.println("Xếp loại: Khá");
        } else if (diemTB >= 7.1 && diemTB <= 8) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diemTB >= 8.1 && diemTB <= 10) {
            System.out.println("Xếp loại: Xuất sắc");
        } else {
            System.out.println("Vui lòng nhập lại điểm phù hợp từ 0-10!");
        }
    }
    /*switch case*/

}
