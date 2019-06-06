
package beginnerjava;

import java.util.Scanner;


public class IfelseDemo {
    
    public static void main(String[] args) {
        
        
        
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any Number: ");
        num=input.nextInt();
        
        if(num>0){
            System.out.println(num+" is a Positive number.");
        }
        
        else{
            System.out.println(num+" is a Negative number");
        }
        
    }
    
}
