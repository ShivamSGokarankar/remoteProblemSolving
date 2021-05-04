package practise;

public class Hckrseven {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[ ]a ;
        for(int i =0 ; i<s.length();i++)
        {

            if((i+k)<=s.length())
                System.out.println( s.substring(i,i+k));
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
       String s = Hckrseven.getSmallestAndLargest("welcometojava",4);
    }
}
