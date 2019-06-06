
package beginnerjava;

import java.util.Scanner;


public class AreaOfTriangle {
    
    public static void main (String[]args){
        
        Scanner input=new Scanner(System.in);
        
        double Height;
        double Base;
        
        System.out.print("Enter the Height of The Triangle: ");
        Height=input.nextDouble();
        
        System.out.print("Enter the Base of The Triangle: ");
        Base=input.nextDouble();
        
        System.out.println("Area of Triangle = "+(.5*Height*Base)+ "m\u00B2");
        
    
    
    }
    
}
