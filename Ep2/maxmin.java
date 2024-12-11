package Ep2;
import java.util.Scanner;
public class maxmin {
   public static  void  mymax(int a,int b, int c){
    int max = 0;
    
    if(a>=b && a>=c){
      max=a;
      System.out.println("Max = " + max);
    }else if (b>=a && b>=c){
      max=b;
      System.out.println("Max = " + max);
    }else if( c>=a && c>=b){
      max=c;
      System.out.println("Max = " + max);
    }
    System.out.println("Max = " + max);
     return max;
   }
   public static void mymin(int a, int b, int c){
      int min = 0;
      if(a<= b && a<=c){
         min =a;
         System.out.println("Min = " + min);
       }else if (b<= a && b<=c){
         min =b;
         System.out.println("Min = " + min);
       }else if (c<= a && c<=b){
         min =c;
         System.out.println("Min = " + min);
       }
       System.out.println("Min = " + min);
      return min;
   }
   
   
   public static void main(String[] args) {
      Scanner scanIn = new Scanner(System.in);
      System.out.println("Enter first number");
      int a = scanIn.nextInt();
      System.out.println("Enter second number");
      int b = scanIn.nextInt();
      System.out.println("Enter last numbe");
      int c = scanIn.nextInt();
      scanIn.close();
      
      int Max = mymax(a, b, c);
      int Min = mymin(a, b, c);

      int total = Max + Min;

      
      System.out.println("total (max + min) = " +total);

      
}
}
