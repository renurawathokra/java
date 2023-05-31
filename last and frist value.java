

import java.util.*;
class Main{
 
  
    public static void  Last(LinkedHashMap<Integer, Integer> lhm)
    
    {
        int count = 1;
 
        for (Map.Entry<Integer, Integer> it :lhm.entrySet())
              {
           
            if (count == lhm.size()) {
               
                System.out.println("Last Key-> "+it.getKey());
              System.out.println("Last Value-> "+it.getValue());
                return;
            }
            count++;
        }
    }
 
  
    public static void First(LinkedHashMap<Integer, Integer> lhm)
    
    {
        int count = 1;
 
        for (Map.Entry<Integer, Integer> it :
             lhm.entrySet()) {
            if (count == 1) {
              System.out.println("First Key-> "+it.getKey());
              System.out.println("First Value-> "+it.getValue());
                return;
            }
            count++;
        }
    }
 
  
    public static void main(String[] args)
    {
 
        LinkedHashMap<Integer, Integer> LHM
            = new LinkedHashMap<>();
 
        LHM.put(2, 5);
        LHM.put(14, 35);
        LHM.put(36, 20);
        LHM.put(34, 18);
        LHM.put(52, 6);
       
      
        First(LHM);
       
      
        Last(LHM);
    }
}
