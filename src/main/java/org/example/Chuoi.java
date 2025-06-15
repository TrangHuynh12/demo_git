package org.example;

import java.util.Locale;

public class Chuoi {
    public static void main(String[] args) {
        //Độ dài của chuỗi
        String greet = "Hello CyberSoft";
        System.out.println(greet.length());
        //Chuyển đổi chuỗi thành chữ hoa hoặc thường
        System.out.println(greet.toUpperCase());
        System.out.println(greet.toLowerCase());
        //Nối chuỗi
        System.out.println("Lời chào "+greet);
        System.out.println("Lời chào ".concat(greet));
    }
}
