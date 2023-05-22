import java.util.*;

public class Main
{
public static void main(String arr[])
 {
System.out.println("Main");
fun1();
fun2();
System.out.println("Main Again");
 
 }
static void fun1()
 {

int a,b;
 Scanner ob = new Scanner(System.in);
System.out.println("Enter Two no...");
a = ob.nextInt();
b = ob.nextInt();
if(a>b)
{
System.out.println("smallest = " +b);
 }
 else
{
System.out.println("smallest = " +a);
 }
 }
static void fun2()
 {

int a,b;
Scanner ob = new Scanner(System.in);
System.out.println("Enter Two no...");
 a = ob.nextInt();
 b = ob.nextInt();
 if(a>b)
 {
 System.out.println("largest = " +a);
 }
else
{
 System.out.println("largest = " +b);
}
}
}
