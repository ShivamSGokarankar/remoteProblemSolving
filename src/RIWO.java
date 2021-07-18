public class RIWO {

    {
        System.out.println("intializer block ");
    }
RIWO()
{
    System.out.println("constrcutor");
}

    public static void main(String[] args) {
        RIWO r = new RIWO();
        RIWO s = new RIWO();
    }

}
