package practise;

public class Hckrseven {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[ ]a=new String[12] ;
        for(int i =0 ; i<s.length();i++)
        {

            if((i+k)<=s.length())
                a[i]= s.substring(i,i+k);
        }

        
        for(int d=0;d<a.length;d++)
        {
            System.out.println(a[d]);
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
       String s = Hckrseven.getSmallestAndLargest("welcometojava",2);
    }
}
