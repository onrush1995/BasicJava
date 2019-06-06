
package beginnerjava;

import java.util.Scanner;


public class TemperatureConverter {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        double Celsius;
        System.out.print("Enter The Temperature in Celsius: ");
        
        Celsius=input.nextDouble();
        
        double Fahrenheit;
        Fahrenheit=1.8*Celsius+32;
        
        System.out.println(Celsius+"° Celsius is "+Fahrenheit+ "° Fahrenheit");
        
        
    }
    
}
