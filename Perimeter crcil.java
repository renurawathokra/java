import java.util.*;
 
class Main {
 
    static final double PI = Math.PI;
 
    
    static double Perimeter(double r)
    {
      return 2 * PI * r;
    }
 
    
    public static void main(String[] args)
    {
 
    
        double r = 3;
 
        
        System.out.println("Perimeter of the circle is :"+ Perimeter(r));
                           
    }
}
