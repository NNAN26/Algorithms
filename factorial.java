import java.util.Scanner;

public class factorial {
    Scanner scanIn = new Scanner(System.in);
    int a = scanIn.nextInt();
    //scanIn.close();
    
    int fact = 1;
    for(int i=1; i<=a ;i++){
        fact = fact*i;
    }
    System.out.println(fact);

}
