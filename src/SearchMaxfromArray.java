public class SearchMaxfromArray
{
    private void Linear_search(int[] a)
    {
        int result = a[0];
        for(int i =0 ; i<a.length ; i++)
            if(result<a[i])
                result=a[i];
        System.out.println(result + "is maximum ");
    }
    public static void main(String[] args)
    {
     int[] a ={101,30,5,40,67,21,1,4,100,2};
     new SearchMaxfromArray().Linear_search(a);
    }
}
