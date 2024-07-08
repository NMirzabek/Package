package uz.pdp.online.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mirza123","NM","mirzabeknormakhmatov03@gamil.com","123456","Mirzabek","YangiTong");
        user.printUserDetails();
        Scanner passcode = new Scanner(System.in);
        System.out.print("Enter a password: ");
        int secretcode = passcode.nextInt();
        int oldcode = 123456;
//        boolean isPasswordChanged = user.changePassword("password123", "password456");

        if(oldcode == secretcode){
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Failed to change password. Old password is incorrect.");
        }

        user.printUserDetails();


    }
}