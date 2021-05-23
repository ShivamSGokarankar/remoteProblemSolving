package practise;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLongArray;

class Cat
{
    int  j ;
    Cat(int j)
    {
        this.j=j;
    }
}
class Dog implements Cloneable
{
    int i ;
    Cat c1 ;
    Dog(Cat c , int i )
    {
        this.c1 = c ;
        this.i = i ;

    }
    public Object Clone() throws CloneNotSupportedException {
        Cat c =  new Cat(c1.j);
        Dog d1= new Dog(c,i);
        return d1;

    }
}
public class A implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cat c2 = new Cat(10);
        Dog d1 = new Dog(c2,20);
        Dog d2=  (Dog)d1.Clone();
        System.out.println(d2.i + " " + d2.c1.j);
    }
}
