public class NumToBin {

    public static void main(String[] args) {

        int number =15 ;

        int j,k;
        int remainder=0;
        int qut = 0 ;
        int[] arr= new int[4];
        for (int i = 1; i <=4; i++) {

            qut=number/2;
            remainder=number%2;
            number=qut;
            arr[arr.length-i]=remainder;


        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
