class TimeCalculter
{
    int minit,hours,second;

     TimeCalculter()

    {
        hours=0;
         minit=0;
         second=0;
    }
    TimeCalculter(int x,int y,int f)
    {
        hours=x;
        minit=y;
        second=f;

    }
    void show()
    {
        System.out.println(hours+":"+minit+":"+second);
       // System.out.println("b ="+minit);

    }
    TimeCalculter copy (TimeCalculter t)
    {
        TimeCalculter ob =new TimeCalculter();
        ob.second=(this.second+t.second)%60;
        ob.minit =(this.minit+t.minit)%60;
        ob.hours =this.hours+t.hours+(this.minit+t.minit)/60+(this.second+t.second)/60;

        return ob ;
    }
    
    
}
    public class Main {
        public static void main(String arr[])
        {
            TimeCalculter ob1 = new TimeCalculter(2,40,40);
            TimeCalculter ob2 = new TimeCalculter(3,40,40);
            TimeCalculter ob3 = new TimeCalculter();
            
            ob1.show();
            ob2.show();

            ob3=ob1.copy(ob2);
            System.out.println();
             ob3.show();
            
           
            
        }
    }
