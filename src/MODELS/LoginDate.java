package MODELS;

public class LoginDate {
    String userID;
    String password;

    public LoginDate(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public boolean isValidUserID() {
        //TODO
        return true;
    }
    public boolean isValidPassword() {
        //TODO
        return true;
    }

    public long getUserID() { return Long.valueOf(userID); }
    public int getHashOfPassword() { return password.hashCode(); }
}
