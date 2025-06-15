package org.example;

public class ToanTu {
    public static void main(String[] args) {
        float a = 10;
        float b = 15;
        float sum = a + b;
        float minus = a - b;
        float multiply = a * b;
        float divided = a / b;
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + multiply);
        System.out.println("a / b = " + divided);

//  tiền tố và hậu tố
//  tiền tố
        System.out.println(++a);
//  hậu tố
        int c = 10;
        int d = c;
        System.out.println(d++);
   /*Toán tử so sánh
        So sánh giá trị (==) */
        int e = 10;
        int f = 15;
        boolean soSanh = (e == f);
        System.out.println(soSanh);
        //So sánh không bằng (!=)
        boolean soSanhKhongBang = (e != f);
        System.out.println(soSanhKhongBang);
    /* so sánh < > >= <=
    toán tử logic
    and(&&)*/
        boolean resul1 = (10 == 15) && (15 == 15);
        System.out.println(resul1);
//        or(||)
        boolean resul2 = (10 == 15) || (15 == 15);
        System.out.println(resul2);
//        not (!)
        boolean resul3 = !(15 > 10);
        System.out.println(resul3);
    }
}
