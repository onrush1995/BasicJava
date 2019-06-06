
package beginnerjava;
import java.util.Scanner;


public class AssignmentDemo {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int x;
        int y;
        System.out.print("Enter the Value of X: ");
        x=input.nextInt();
        System.out.print("Enter the Value of Y: ");
        y=input.nextInt();
        
        
       
        
        x+=y;// x = x+y
        System.out.println("X = "+x);
        
        x-=y;// x = x-y
        System.out.println("X = "+x);
        
        x*=y;// x = x*y
        System.out.println("X = "+x);
        
        x/=y;// x = x/y
        System.out.println("X = "+x);
        
        x%=y;// x = x%y
        System.out.println("X = "+x);
        
    }
    
}
