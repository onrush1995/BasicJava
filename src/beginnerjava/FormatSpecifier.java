
package beginnerjava;


public class FormatSpecifier {
    
    public static void main (String[]args){
        
        boolean b;
        char c;
        int i;
        float f;
        double d;
        
        b=true;
        c='B';
        i=2345;
        f=10.5f;
        d=10.5;
        
        System.out.printf("boolean b = %b \n",b);
        System.out.printf("character c = %c\n",c);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.3f\n",f); //%.3f is used inorder to control the decimal after value.By default it is 6.
        System.out.printf("double d = %f\n",d);
        
        
        
        
    }
    
}
