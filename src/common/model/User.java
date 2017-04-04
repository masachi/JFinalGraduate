package common.model;

/**
 * Created by Masachi on 2017/4/4.
 */
public class User {
    private String username;
    private String password;
    private String capture;

    public User(String username, String password, String capture) {
        this.username = username;
        this.password = password;
        this.capture = capture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCapture() {
        return capture;
    }

    public void setCapture(String capture) {
        this.capture = capture;
    }
}
