package Ep2;
//7. จงเขียนโปรแกรมรับค่าขนาดของ Array 1 มิติ จากแป้นพิมพ์ 
//จากนั้นรับค่าจำนวนเต็มตามขนาดของ Array
import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าขนาดของ Array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // ประกาศ Array 1 มิติ
        int[] array = new int[size];

        // รับค่าจำนวนเต็มเข้าสู่ Array
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // แสดงผลลัพธ์ตามลำดับหน้าไปหลัง
        System.out.print("Array in forward order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // แสดงผลลัพธ์ตามลำดับหลังไปหน้า
        System.out.print("Array in reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
