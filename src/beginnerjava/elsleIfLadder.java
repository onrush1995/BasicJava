
package beginnerjava;

import java.util.Scanner;


public class elsleIfLadder {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter any Number : ");
        number=input.nextInt();
        
        if(number>0){
            System.out.println(number+" is a Positive number");
        }
        
        else if(number<0){
            System.out.println(number+" is a Negative Number");
        }
        
        else {
            System.out.println(number+" is Zero");
        }
       
    }
    
}
