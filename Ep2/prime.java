package Ep2;
import java.util.Scanner;

//4.รับค่า n เข้าผ่านทางแป้นพิมพ์ จากนั้นให้เขียนฟังก์ชัน prime เพื่อแสดงจำนวนเฉพาะ
public class prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input number: ");
        int n = scanner.nextInt();
        System.out.println("Prime numbers are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

