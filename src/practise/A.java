package practise;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLongArray;



class myThread extends  Thread
{

    static Thread mt ;

    public void run()
    {
        try
        {
            mt.join();
        }
        catch (InterruptedException e)
        {

        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread ");
        }
    }

}

public class A
{
    public static void main(String[] args) throws InterruptedException {

        myThread.mt=Thread.currentThread();
        myThread t = new myThread();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread ");
            Thread.sleep(1000);
        }
    }
}


