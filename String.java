class My1
{
    public void main (String []arr)
    {
        String s1="Mohan";
        String s2="mohan";
        String s3="Mohan";
        
        System.out.println(s1.lenght());//5
     System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals Igmeerecase(s2));
        
        
    }
}


========================
class Main
{
public static void main (String arr[])
{
String s2="hello";
System.out.println("s1");
s2=("rajastan"); 
//deffernt memory location say 
System.out.println("s2");
}
}



==================


class Main{
public static void main (String []arr)
{
String s1 ="hello";
String s2=new String("demo");
char ch[]={'R','e','n','u'};
String s3 =new  String(ch);
byte b[]={65,66,67,68};
String s4=new String (b);
System.out.println("s1");
System.out.println("s2");
System.out.println("s3");
System.out.println("s4");

}
}

==========================================
==========================================
class Main{
   public static void main (String []arr)
   {
   String s1="rajasthan";
   
   System.out.println(s1.startsWith("raj"));
   System.out.println(s1.startsWith("rraj"));
   System.out.println(s1.startsWith("raj"));
   System.out.println(s1.startsWith("stan"));
   System.out.println(s1.startsWith("stan"));
   
}
}
==============================
==============================
class Main{
   public static void main (String []arr)
   {
   String s1="rajasthan";
   
   System.out.println(s1.indexOf("j"));
   System.out.println(s1.indexOf("aj"));
   System.out.println(s1.indexOf("raj"));
   System.out.println(s1.indexOf("A"));
   System.out.println(s1.indexOf("a"));
   System.out.println(s1.indexOf("a"));
   System.out.println(s1.indexOf("a"));
   
}
}
==========================
==============================
class Main{
   public static void main (String []arr)
   {
   String s1="Renu";
   String s2="renu";
   String s3="Renu";
   String s4="Renu Rawat";
   
   System.out.println(s1.compareTo(s3));
   System.out.println(s1.compareTo(s2));
   System.out.println(s2.compareTo(s3));
   System.out.println(s3.compareTo(s4));
   System.out.println(s4.compareTo(s1));
   
   
}
}
======================
========================
class Main {  
    public static void main(String[] args) {  
    String str = "Welcome to Javatpoint portal";      
    int strLength = str.length();      
    // Fetching first character  
    System.out.println("Character at 0 index is: "+ str.charAt(0));      
    // The last Character is present at the string length-1 index  
    System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  
}      
