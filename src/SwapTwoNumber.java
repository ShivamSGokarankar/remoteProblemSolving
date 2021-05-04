//using third variable
public class SwapTwoNumber {

    private void swap (int first_number,int second_number)
    {
        int temp = first_number;
        first_number=second_number;
        second_number=temp;
        System.out.println("after swapping");
        System.out.println(first_number + " " + second_number);
    }
    public static void main(String[] args) {
        

        int first_number =10 ; 
        int second_number=20 ; 
        System.out.println("Before swapping "+first_number + " " + second_number);
        new SwapTwoNumber().swap(first_number, second_number);

        
        

    }
}
