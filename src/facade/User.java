package facade;

public class User {

    private String UserNameValid = "eliosf27";
    private String userName;

    public User() {
        this.userName = null;
    }
    
    public User(String newUserName) {
        this.userName = newUserName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isValid(String userName) {
        return userName == UserNameValid ? true : false;
    }

}
