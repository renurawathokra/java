import java.util.*;
 
public class Main {
 
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();
 
        ll.add("Renu");
        ll.add("sonu");
        ll.add(1, "shalu");
 
        System.out.println("Initial LinkedList " + ll);
 
        ll.set(1, "and");
 
        System.out.println("Updated LinkedList " + ll);
    }
}
