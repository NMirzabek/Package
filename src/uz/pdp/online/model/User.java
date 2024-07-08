package uz.pdp.online.model;

public class User {
    String id;
    public String username;
    public String email;
    String password;
    String name;
    String address;

    public User(String id, String username, String email, String password, String name, String address){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }

    public void printUserDetails() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }


}
