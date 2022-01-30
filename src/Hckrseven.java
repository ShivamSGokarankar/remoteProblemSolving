import java.util.ArrayList;

public class Hckrseven {
    public static String getSmallestAndLargest(String s, int k) {
        int length_s = s.length();
        int i,counter;
        String smallest;
        String largest;
        ArrayList<String> slicedArray= new ArrayList<String>();
        StringBuffer smallest_=new StringBuffer();
        StringBuffer largest_=new StringBuffer();

        if(length_s==0 || length_s==k)
        {
            System.out.println("String cant be processed.");
        }
        else
        {
            counter=length_s;
               for (i = 0; i < length_s; i++)
               {
                   if((i+k)<=length_s && counter>=k)
                   {
                       slicedArray.add(s.substring(i,(i+k)));
                       counter--;
                   }
               }
        }
        System.out.println(slicedArray.size());
        smallest_.replace(0,slicedArray.size(),slicedArray.get(0));
        largest_.replace(0,slicedArray.size(),slicedArray.get(0));

        for (int x =1; x<slicedArray.size();x++)
        {
            if(smallest_.toString().compareTo(slicedArray.get(x).toString())>0)
            {
                    smallest_.replace(0,k,slicedArray.get(x));
            }else if ((largest_.toString().compareTo(slicedArray.get(x).toString())<0))
            {
                    largest_.replace(0,k,slicedArray.get(x));
            }
        }
        smallest=smallest_.toString();
        largest=largest_.toString();
        return  "\n"+smallest + "     "  + largest;
    }
    public static void main(String[] args)
    {
        String s= Hckrseven.getSmallestAndLargest("welcometojava",3);
        System.out.println(s);

    }
}
