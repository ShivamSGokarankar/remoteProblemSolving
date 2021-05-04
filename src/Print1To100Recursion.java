public class Print1To100Recursion {
    private int print(int n )
    {
        if(n<=100)
        {
            System.out.println(n);
            return print(n+1);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        new Print1To100Recursion().print(1);
    }
}
