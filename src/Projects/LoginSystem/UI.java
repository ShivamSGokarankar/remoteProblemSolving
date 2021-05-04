package Projects.LoginSystem;

import java.util.Scanner;

public class UI {
    static String enteredUsername;
    static String enteredPassword;
    public static void main(String[] args) {
        System.out.println("Please loggin !");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter username : ");
        UI.enteredUsername=scanner.nextLine();
        System.out.println("Enter Password");
        UI.enteredPassword=scanner.nextLine();

    }
}
