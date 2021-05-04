package Projects.LoginSystem;

public class User extends UI{
    String userName;
    String password;
    User(String enteredUsername ,String enteredPassword)
    {
        this.userName=enteredUsername;
        this.password=enteredPassword;
    }
    public void isValidUser()
    {
        Login l = new Login(enteredUsername,enteredUsername);

    }



}
