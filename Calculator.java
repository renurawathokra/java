import java.util.*;
public class Calculator {
   public static void main(String arr[]){
    int a,b,result;
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter 1st no. :");
    a = ob.nextInt();
    System.out.print("Enter 2nd no. :");
    b = ob.nextInt();

    System.out.print("Enter a opertion (+,-,*,/,%) :");
 char ch = ob.next().charAt(0);
    switch(ch){
        case '+':
        result = a+b;
        System.out.print("Result ="+result);
        break;
        case '-':
        result = a-b;
        System.out.print("Result ="+result);
        break;
        case '*':
        result = a*b;
        System.out.print("Result ="+result);
        break;
        case '/':
        result = a/b;
        System.out.print("Result ="+result);
        break;
        case '%':
        result = a%b;
        System.out.print("Result ="+result);
        break;
        default:
        System.out.print("invaild number");

    }

   } 
}
