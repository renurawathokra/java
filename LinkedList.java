import java.util.*;
 

public class Main
{
 
    
    public static void main(String args[])
    {
        
        LinkedList<String> ll = new LinkedList<String>();
 
        ll.add("R");
        ll.add("E");
        ll.addLast("N");
        ll.addFirst("U");
        ll.add(2, "R");
 
        System.out.println(ll);
 
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
