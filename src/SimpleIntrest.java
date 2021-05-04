public class SimpleIntrest {
    public static void main(String[] args) {
        
        double principal_amount = 100;
        double interest_rate = 10;
        int duration = 2;
        double Simple_Intrest= principal_amount*interest_rate*duration*12/100;
        System.out.println("Amount : " + principal_amount + "\nInterest Rate :" +
        interest_rate+ "% \nDuration :" + duration + " Month \nTotal Simple Interest is :" + Simple_Intrest);
    }    
}
