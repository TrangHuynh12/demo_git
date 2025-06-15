package org.example;

public class Mang {
    public static void main(String[] args) {
        //Khởi tạo giá trị
        int[] nums = {10, 20, 30};
        String[] name = {"A", "B", "C"};
        System.out.println(name[1]);
        name[2] = "D";
        System.out.println(name[2]);
        //chiều dài của mảng
        int length = name.length;
        System.out.println("Chiều dài của mảng: " + length);

        //duyệt mảng
        for (int i = 0; i < name.length; i++) {
            System.out.println("Tên thứ " + (i + 1) + "," + name[i]);
        }
        //duyệt mảng dùng lặp for-each
        for (int number : nums) {
            System.out.println(number);
        }
        //duyệt mảng ngược
        for (int index = nums.length - 1; index >= 0; index--) {
            System.out.println(nums[index]);
        }

    }
}
