package practise;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLongArray;

class Display {

    public synchronized void displayn()
    {
        for (int i = 1; i < 10; i++) {

            System.out.print(i);
            try
            {
                Thread.sleep(600);
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    public synchronized void displayc()
    {
        for (int i = 65; i < 74; i++) {

            System.out.print((char)i);
            try
            {
                Thread.sleep(600);
            }
            catch (InterruptedException e)
            {

            }
        }
    }

}

class myThread1 extends Thread
{
    Display d ;
    myThread1(Display d )
    {
        this.d=d;

    }

    @Override
    public void run() {
         d.displayn();
    }
}

class myThread2 extends Thread
{
    Display d ;
    myThread2(Display d )
    {
        this.d=d;
    }

    @Override
    public void run() {
        d.displayn();
    }
}

public class A {
    public static void main(String[] args) throws InterruptedException
    {
        Display d= new Display();
        myThread1 m1= new myThread1(d);
        myThread2 m2 = new myThread2(d);
        m1.start();
        m2.start();
    }
}


