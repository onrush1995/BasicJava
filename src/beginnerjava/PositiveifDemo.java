
package beginnerjava;

import java.util.Scanner;


public class PositiveifDemo {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        int number;
        System.out.print("Enter any Integer: ");
        
        number= input.nextInt();
        
        if(number>0){
            
                System.out.println("Positive");
        }
        
        
    }
    
}
