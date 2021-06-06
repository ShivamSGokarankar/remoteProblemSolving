package practise;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLongArray;

class Display
{

    synchronized public void wish(String name )
    {
        for (int i = 0; i < 4; i++) {
            System.out.print("\"Good morning\" ");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {

            }
            System.out.println(  name );
        }
    }
}

class myThread extends  Thread
{

    Display d ;
    String name ;

    public myThread( Display d ,String name )
    {
        this.name=name;
         this.d = d; //dont create new object here 

    }
    public void run()
    {
        d.wish(name);
    }
}

public class A {
    public static void main(String[] args) throws InterruptedException
    {
        Display d= new Display();
        myThread m1 = new myThread(d,"shivam");
        myThread m2 = new myThread(d,"shi");
        myThread m3 = new myThread(d,"fddfm");
        myThread m4 = new myThread(d,"shgfhfghhfam");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}


