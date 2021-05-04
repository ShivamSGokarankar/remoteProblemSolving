
public class SwapThreeNumberWOThird {
    private void swap(int a, int b, int c) {
        a= a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("After swapping");
        System.out.println("a : " +a + " b : " + b + " c : " +c);
    }
    public static void main(String[] args) {
        int a=32 ; 
        int b =21 ;
        int c=57;
        System.out.println("before swapping");
        System.out.println("a : " +a + " b : " + b + " c : " +c);
        new SwapThreeNumberWOThird().swap(a,b,c);
    }
}
