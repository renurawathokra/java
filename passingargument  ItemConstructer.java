import java.util.*;
class ItemConstructer
{
    int itemCode;
    String itemName;
    int sellingPrize;

    ItemConstructer()
    {
        itemCode = 0;
        itemName = " ";
        sellingPrize = 0;
    }    
    ItemConstructer (int x,String y,int z)
    {
        itemCode = x;
        itemName = y;
        sellingPrize = z;
    }
    void fun(ItemConstructer t)
    {
        this.itemCode = t.itemCode;
        this.itemName = t.itemName;
        this.sellingPrize = t.sellingPrize;
    }
    void show()
    {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(sellingPrize);


    }
}
 public class Main
{
    public static void main(String arr[])
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter  Item Code :");
          int c = obj.nextInt();
        System.out.print("Enter Item  name :");
          String n = obj.next();
        System.out.print("Enter Item Selling Prize :");
           int p= obj.nextInt();

            ItemConstructer ob = new ItemConstructer();
        ItemConstructer ob1 = new ItemConstructer(c,n,p);
        
        

        ob.fun(ob1);
        ob1.fun(ob);

        ob.show();
        System.out.println();
        ob1.show();



    }
}
