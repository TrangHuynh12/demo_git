package org.example;

public class Ham {
    /*hàm được định nghĩa ở đây
    * có 2 loại hàm:
    * hàm không có giá trị trả về (hàm thực hiện logic)
    * static void tenHam(){}
    * hàm có giá trị trả về
    * static <kiểu dữ liệu> tenHam(){}
    * */
    static void greeting(){
        System.out.println("Hello World");
    }
    public static double getDTB(double toan, double ly, double hoa) {
        double dtb = (toan + ly + hoa) / 3;
        return dtb;
    }
    public static void main(String[] args) {
        greeting();
        double toan =  8;
        double ly = 6;
        double hoa = 7;
        double dtb = getDTB(toan,ly,hoa);
        System.out.println(dtb);

    }
}
