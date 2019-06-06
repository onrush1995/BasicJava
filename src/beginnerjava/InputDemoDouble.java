
package beginnerjava;
import java.util.Scanner;


public class InputDemoDouble {
    
    public static void main(String[] args) {
        
       Scanner s=new Scanner(System.in);
        
       double number;
       System.out.print("Enter your Double Number: ");
       number=s.nextDouble();
       
       System.out.println("Your Double number is :"+number);
    }
    
}
