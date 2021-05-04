package practise;

import java.util.Scanner;

public class Hckrthree {

    static int B;
    static int H;
    static boolean flag;
    static
    {
        Scanner scan =  new Scanner (System.in);
        B =scan.nextInt();
        H=scan.nextInt();
        if(B<=0 || H<=0)
        {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            flag=true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//en
}