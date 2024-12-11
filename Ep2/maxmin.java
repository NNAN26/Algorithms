package Ep2;
import java.util.Scanner;

public class maxmin {
    // ฟังก์ชันหาค่าสูงสุด
    public static int mymax(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    // ฟังก์ชันหาค่าต่ำสุด
    public static int mymin(int a, int b, int c) {
        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าจากผู้ใช้
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        // เรียกใช้ฟังก์ชัน mymax และ mymin
        int max = mymax(a, b, c);
        int min = mymin(a, b, c);

        // ผลลัพธ์จากการบวกค่ามากที่สุดและค่าน้อยที่สุด
        int total = max + min;

        // แสดงผลลัพธ์
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Total (max + min) = " + total);

        scanner.close();
    }
}

