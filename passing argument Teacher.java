import java.util.*;
class Teacher
{
    int code;
    String name;
    int salary;
    
    Teacher()
    {
        code=0;
        name="";
        salary=0; 
    }
    Teacher(int c,String nm,int s)
    {
        code=c;
        name=nm;
        salary=s;        
		              
    }
    void fun(Teacher t)
    {
        this.code=t.code;
        this.name=t.name;
        this.salary=t.salary;
    }
    void show()
    {
        System.out.println(code);
        System.out.println(name);
        System.out.println(salary);
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);
        
         
        System.out.print("Enter Teacher code :");
          int c = ob.nextInt();
        System.out.print("Enter Teacher name :");
          String nm = ob.next();
        System.out.print("Enter Sallary :");
           int s= ob.nextInt();

            Teacher t1 = new Teacher();
        Teacher t2 = new Teacher(c,nm,s);
        
        

        t1.fun(t2);
        t2.fun(t1); 
                               
        t1.show();
        System.out.println();
        t2.show();


    }
} 
