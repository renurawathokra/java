import java.util.*;
class A
{
    int a;
    void getA()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a value");
        a=ob.nextInt();
        
    }
    void showA()
    {
        System.out.println(a);
    }
}
class B extends A
{
    int b;
    void getB()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter b value");
        b=ob.nextInt();
        
    }
    void showB()
    {
        System.out.println(b);
    }
}
class C extends B
{
    int  c;
    void getc()
    {
        c=a+b;
    }
     void show()
    {
        System.out.println(c);
    }
    
}
class Main{
    public static void main(String arr[]){
        C obj=new C();
        obj.getA();
        obj.getB();
        obj.getc();
        obj.show();
        
    }
}
