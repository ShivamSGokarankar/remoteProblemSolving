package practise;

import java.util.Scanner;

public class Hckrtwo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* in short ");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* in int ");
                }
                if (x >=-9223372036854775808l && x <=9223372036854775807l) {
                    System.out.println("* in long ");
                }


            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
