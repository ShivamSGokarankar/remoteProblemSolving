package practise;


public class Child {

    static int i;
    static
    {
        System.out.println("static block");
    }

    static void  m1()
    {
        System.out.println("m1 called");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }


}
