package practise;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLongArray;



class myThread extends  Thread
{
    public void run()
    {
        try
        {
            for (int i = 0; i <10 ; i++) {
                System.out.println("child ");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("got interupted ");
        }
    }

}

public class A
{
    public static void main(String[] args) throws InterruptedException {
        myThread t = new myThread();
        t.start();
        t.interrupt();
    }
}


