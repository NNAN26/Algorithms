package Ep2;

import java.util.Scanner;

public class calculateValue {
    static int fact = 1, fibonanci = 0;
    static int a;
    public static int Factorial(int a){
        for (int i = 1; i <= a; i++) {
        System.out.println(i + "! =" + fact);
        fact += fact * i;
        }
        fact = fact/(a+1);
        return(fact);
        }
    public static int Fibonanci(int a){
        int f0 = 0, f1=1;
        if(a>=0){
            System.out.println("f0 = " + f0);}
        if(a >=1){
            System.out.println("f1 = " + f1);}
        for(int i =2; i<= a; i++){
        fibonanci= f0 + f1;
            System.out.println("f" + i+ " = "+fibonanci);
        f0 = f1;
        f1 = fibonanci;}
            System.out.println("Value of Fibonanci is " + f1);
        return(fibonanci);
        }
     
        public static void main(String[] args) {
            Scanner scanIn = new Scanner (System.in);
            System.out.println("Enter number");
            int a = scanIn.nextInt();
                
            if (a <0 || a>99) {
                System.out.println("End");
                return;
                
            }
            Factorial(a);
            Fibonanci(a);
            System.out.println(fact);
            System.out.println(fibonanci);
            System.out.println(fact - fibonanci);
            }
        }

