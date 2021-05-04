public class HornerSummation
{


    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int n = a.length;
        int x = 5;
        int result=0;
        for(int i =0;i<n;i++)
        {
            result=result + a[i]*(int)Math.pow(x,i);
        }
        System.out.println(result);



    }
}
