

public class Hckrsix {
    public static void main(String[] args) {

        String a = "aello";
        String b = "bava";

        int sum = a.length() + b.length();
        System.out.println(sum);
        if (a.compareTo(b)>0) {
            System.out.println("Yes");

        }
        else
        {

            System.out.println("No");
        }
        System.out.println(a.substring(0,1).toUpperCase()+ a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1));

    }
}
