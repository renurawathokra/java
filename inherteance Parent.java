# java	
	import java.util.*;
class Parent
{
    int a, b;
    void setA()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter  first value");
        a= ob.nextInt();
         System.out.println("enter Second value");
        b= ob.nextInt();
 }
    void showA()
{
 
}
}
class Child extends Parent
{
    int add,sub,mul,rem;
    void doAdd()
    {
        add=a+b;
    }
   
    void doSub()
    {
        sub=a-b;
    }
    
    void doMultipal()
    {
        mul=a*b;
    }
   
    void doReminder()
    {
        rem=a/b;
    }
    void showAll()
    {
        System.out.println("value of add"+add);
        System.out.println("value of sub"+sub);
        System.out.println("value of mul"+mul);
        System.out.println("value of rem"+rem);
    }
}

class Main
{
    public static void main(String arr[])
    {
        Child obj=new Child();
        obj.setA();
        obj.showA();
        obj.doAdd();
        obj.doSub();
        
        obj.doAdd();
        obj.doSub();
        obj.doMultipal();
        obj.doReminder();
        obj.showAll();
    }
}
