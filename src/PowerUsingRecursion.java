public class PowerUsingRecursion {
    private static int power(int x , int n )
    {
        if(x==0)
            return 1;
        else if (n%2==0)
            return power(x*x,n/2) ;
        else
            return x*power(x*x ,n/2);
    }
    public static void main(String[] args)
    {
        System.out.println(PowerUsingRecursion.power(2,10));
    }
}
