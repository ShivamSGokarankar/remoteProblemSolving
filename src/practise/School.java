package practise;

import java.util.Scanner;

public class School {

    protected Student createStudent(Student s1)
    {
        System.out.println("enter name");
        s1.name = new Scanner(System.in).nextLine();
        System.out.println("enter roll no ");
        s1.roll_no=new Scanner(System.in).nextInt();
        return s1;
    }
    protected void getStudent()
    {

    }

    public static void main(String[] args) {

    }

}
