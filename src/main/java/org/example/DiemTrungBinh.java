package org.example;

import java.util.Scanner;
public class DiemTrungBinh {
    public static double tinhdiemtrungbinh(double diemToan, double diemLy, double diemHoa){
        return (diemToan+diemLy+diemHoa)/3;
    }
    public static String xepLoaiHS(double diemTB){
        if (diemTB > 0 && diemTB <= 5) {
            return "Xếp loại: Yếu";
        } else if (diemTB >= 5.1 && diemTB <= 6) {
            return "Xếp loại: Trung bình";
        } else if (diemTB >= 6.1 && diemTB <= 7) {
            return "Xếp loại: Khá";
        } else if (diemTB >= 7.1 && diemTB <= 8) {
            return "Xếp loại: Giỏi";
        } else if (diemTB >= 8.1 && diemTB <= 10) {
            return "Xếp loại: Xuất sắc";
        } else {
            return "Vui lòng nhập lại điểm";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán:");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhập vào điểm môn Lý:");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập vào điểm môn Hóa:");
        double diemHoa = scanner.nextDouble();

        double diemTB = tinhdiemtrungbinh(diemToan,diemLy,diemHoa);
        String xeploai = xepLoaiHS(diemTB);

        System.out.printf("Điểm trung bình: %.2f\n", diemTB);
        System.out.println(xeploai);

    }
}
/* Viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán, lý hoá, sau đó tính điểm trung bình.
        Nếu đtb:
        <=5 -> hs yếu
        5.1-6: hs tb
        6.1-7: hs khá
        7.1-8: hs giỏi
        8.1-10: hs xs
        Tách hàm tính điểm trung bính và hàm xếp loại*/
