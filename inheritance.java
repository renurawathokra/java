import java.util.*;
class Student
{
 int rollNo;
 String name;
 String  cls;

Scanner ob = new Scanner (System.in);
 void  getInfo()
  {
   System.out.print("Enter Student RollNumber :");
   rollNo = ob.nextInt();
    System.out.print("Enter Student Name :");
   name = ob.next();
    System.out.print("Enter Student class :");
   cls = ob.next();
  }
}
class Marks extends Student
{
 int  hindi, eng, math, ss, maxMarks;
  
 void  getMarks()
  {
   System.out.print("Enter hindi Marks :");
   hindi = ob.nextInt();
    System.out.print("Enter English Marks :");
   eng = ob.nextInt();
    System.out.print("Enter Math Marks :");
   math = ob.nextInt();
    System.out.print("Enter Socile Senice Marks :");
   ss = ob.nextInt();
    System.out.print("Enter MaxMarks Marks :");
   maxMarks = ob.nextInt();
  }
}
class Result extends Marks
{
  int totalMarks, percentageOfMarks;

  void calculateResult()
  {
    totalMarks = hindi+eng+math+ss;
    percentageOfMarks = (totalMarks *100) / 400;
  }
  void showInfo()
  {
     System.out.println("RollNumber ="+rollNo);
     System.out.println("Name ="+name);
     System.out.println("Class ="+cls);
  }
 void  showMarks()
  {
    System.out.println("Hindi ="+hindi);
    System.out.println("English ="+eng);
    System.out.println("Math ="+math);
    System.out.println("Socile Senice ="+ss);

  }
  void showResult()
  {
        System.out.println("totalMarks ="+totalMarks);
        System.out.println("Result ="+percentageOfMarks+"%");

  }
}


class Main
{
  public static void main(String hhh[])
  {
    Result obj = new Result();
    
    obj.getInfo();
    obj.getMarks();
    obj.calculateResult();
    obj.showInfo();
    obj.showMarks();
    obj.showResult();
  }
}
