package practise;

import java.util.Scanner;

public class Hckrone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s="               ";
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf(s1+s+x);
            //Complete this line
        }
        System.out.println("================================");
}
}
