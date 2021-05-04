//with third cariable
public class SwapThreeNumber {
    private void swap(int a ,int b,int c )
    {
        int temp = c;
        c=b;
        b=a;
        a=temp;
        System.out.println("After swapping");
        System.out.println("a : " +a + " b : " + b + " c : " +c);
    }
    public static void main(String[] args) {
        int a=132; 
        int b =25 ;
        int c=321;
        System.out.println("before swapping");
        System.out.println("a : " +a + " b : " + b + " c : " +c);
        new SwapThreeNumber().swap(a, b, c);
    }   
}
