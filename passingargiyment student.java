import java.util.*;
class Student
{
    int studentRollNumber;
    String stuName;
   String studentClas;
      int stuPhoneNumber;
      
    Student()
    {
       
      studentRollNumber=0;
      stuName = "";  
     studentClas ="";
      stuPhoneNumber=0;
    }
        Student( int a,String b,String c,int d)
    {
       studentRollNumber=a;
        stuName=b;
        studentClas=c;
        stuPhoneNumber=d;
    }
    void fun(Student s)
    {
        this.stuName=s.stuName;
        this.studentRollNumber=s.studentRollNumber;
        this.studentClas=s.studentClas;
        this.stuPhoneNumber=s.stuPhoneNumber;
    }
    void show()
    {
        System.out.println(stuName);
        System.out.println(studentRollNumber);
        System.out.println(studentClas);
        System.out.println(stuPhoneNumber);
    
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);
        
         
        System.out.print("Enter Student rollNumber :");
          int a = ob.nextInt();
        System.out.print("Enter Student name :");
          String b = ob.next();
        System.out.print("Enter Student class :");
           String c= ob.next();
           
           System.out.print("Enter Student phoneNumber :");
           int d= ob.nextInt();

            Student s1 = new Student();
       Student s2 = new Student(a,b,c,d);
        
        

        s1.fun(s2);
        s2.fun(s1);

        s1.show();
        System.out.println();
        s2.show();



    }
}
