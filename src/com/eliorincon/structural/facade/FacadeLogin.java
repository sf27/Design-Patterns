package facade;

public class FacadeLogin {

    private String   user, password;

    private User     ClassUser;
    private Password ClassPassword;

    public FacadeLogin(String newUserName, String newPassword) {
        this.user = newUserName;
        this.password = newPassword;

        ClassUser = new User();
        ClassPassword = new Password();
    }

    public void logIn() {
        if (ClassUser.isValid(user) && ClassPassword.isValid(password)) {
            System.out.println("Welcome to the main page of the system " + user + " \n");
        } else {
            System.out.println("Log In Failed\n");
        }
    }

}
