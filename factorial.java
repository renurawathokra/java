import java.util.Scanner;  
  
 class factorial
 {  
  
     
    public static int fact_with_do_while (int n){  
        int fact = 1;  
        int i = 1;  
  
        do {  
            fact = fact * i;   
            i++;   
        } while( i <= n );  
  
        
        return fact;  
  
    }  
    public static void main(String[] args) {  
          
        Scanner sc = new Scanner(System.in);  
  
    
        System.out.println("Enter a number whose factorial is to be found: ");  
        int num = sc.nextInt();  
      
         
        System.out.println("\nFactorial of " + num + " is: " + fact_with_do _while(num));  
    }  
}  
