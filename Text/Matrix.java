
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrixA = new int[3][3]; // สร้าง Matrix ขนาด 3x3
        for (int i = 0; i < 3; i++) { // รับค่า Matrix ขนาด 3x3
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Matrix index of [" + i + "][" + j + "] : ");
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nNormal MatrixA is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        
        
        int[][] matrixB = new int[3][3]; // สร้าง Matrix ขนาด 3x3
        for (int i = 0; i < 3; i++) { // รับค่า Matrix ขนาด 3x3
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Matrix index of [" + i + "][" + j + "] : ");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nNormal MatrixB is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();

            System.out.println("matrixA + matrixB" );
        }
        
        

    }

    

