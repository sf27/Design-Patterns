package facade;

public class Password {

    private String passwordValid = "27";
    private String password;

    public Password() {
        this.password = null;
    }

    public Password(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid(String password) {
        return password == passwordValid ? true : false;
    }

}
