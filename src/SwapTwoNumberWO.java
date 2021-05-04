public class SwapTwoNumberWO {

    private void swapWOthird(int a ,int b)
    {          
            a= a+b;
            b= a-b;
            a= a-b;
            System.out.println("after swapping");
            System.out.println(a + " "+ b);
    }
    public static void main(String[] args) {
         int number1 =10 ;
         int number2 =20;
         new SwapTwoNumberWO().swapWOthird(number1,number2);
    }
    
}
