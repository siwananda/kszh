package models;

/**
 * This class holds user's information
 * kszh = Krazeh Spizeh
 * By: W, R, H
 * Date: 17/12/2014
 * Time: 9:44 PM
 * Class Name: User
 */
public class User {
    private String email;
    private String password;
    private boolean active;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
