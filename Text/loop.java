import java.util.Scanner;
public class loop {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter N");
    int n = scanner.nextInt();
    scanner.close();
    for (int i=n; i<= n ; i++){
        for(int j = 1; j<=n; j++){         
            System.out.print(  " * " );
            
        }
        }
        for(int i = n; i>= 1; i--){ 
            for(int j = 1; j<= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        
        }
}
}

