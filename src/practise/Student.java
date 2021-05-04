package practise;

public class Student extends School {
    String name;
    int roll_no;



    public static void main(String[] args) {
        Student s1=new School().createStudent(new Student());
        System.out.println("student granted by school");

    }



}
