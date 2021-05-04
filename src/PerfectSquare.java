public class PerfectSquare {

    public static void main(String[] args) {
        
        int number =2 ; 
        double sqrt = Math.sqrt(number);
        if((int)sqrt*sqrt==number)
        {
            
            System.out.println("\'" +number + "\' is perfect square number");
        }
        else
        {
            System.out.println("\'"+number + "\' is not perfect square number");    
        }
    }
    
}
