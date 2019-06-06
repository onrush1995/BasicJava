
package beginnerjava;

import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        double Radius,Area;
        
        
        
        System.out.print("Enter the Radius of Circle: ");
        Radius=input.nextDouble();
        
        Area=2*Radius*Radius*Math.PI;
        
        
        System.out.println("Area of Circle = "+ Area+"m\u00b2");
    }
    
}
