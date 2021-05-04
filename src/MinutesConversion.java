import java.util.Scanner;

public class MinutesConversion {
    
    public float toSeconds(float minutes)
    {   
            return minutes*60;
    }
    public float toHours(float minutes)
    {
        return minutes/60;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Minutes");
         float minutes = sc.nextInt();
         System.out.printf(minutes + " Minutes ");
         System.out.println(new MinutesConversion().toSeconds(minutes) + " Sec.");
         System.out.println(new MinutesConversion().toHours(minutes) + " Hr.");
         sc.close();

    }
}
