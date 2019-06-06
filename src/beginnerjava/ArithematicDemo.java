
package beginnerjava;

import java.util.Scanner;


public class ArithematicDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1,num2,result;
        //double result2;
       
        
        System.out.print("Enter First Number: ");
        num1=input.nextInt();
        System.out.print("Enter Second Number: ");
        num2=input.nextInt();
        
       
        
        result=num1+num2;
        System.out.println("Sum = " +result);
        
        result=num1-num2;
        System.out.println("Subtract = " +result);
        
        result=num1*num2;
        System.out.println("Multiplication = " +result);
        
        double result2= (double)num1 / num2;
        System.out.println("Divide = " +result2);
        
        result=num1%num2;
        System.out.println("Remainder= " +result);
        
    }
    
}
