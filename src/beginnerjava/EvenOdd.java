
package beginnerjava;

import java.util.Scanner;


public class EvenOdd {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num,result;
        
        System.out.print("Enter any Number : ");
        num=input.nextInt();
        
        //Calculation for result 
        
        result=num%2;
        
        if (result==0){
            System.out.println("Even");
        }
        else{
        
            System.out.println("Odd");
        }
        
        
      
        
               
    }
        
    
    
    
    
}
