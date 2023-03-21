package online.shop;

import java.io.Console;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Customer {
    private UUID id;
    private LocalDate createdAccount;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean loggedIn;

    public Customer(String firstName, String lastName, String userName) {
        this.id = UUID.randomUUID();
        this.createdAccount = LocalDate.now();

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        setPassword();
        login();
    }

    private void setPassword() {
        Console console = System.console();
        System.out.print("Enter a new password: ");
        this.password = new String(console.readPassword());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", createdAccount=" + createdAccount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + ("*".repeat(password.length())) + '\'' +
                '}';
    }

    //Functionality:
    public boolean login() {
        Console console = System.console();

        System.out.print("Enter the username: ");
        String userName = console.readLine();
        System.out.print("Enter the password: ");
        String password = new String(console.readPassword());

        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println("Logged in!");
            this.loggedIn = true;
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public void logout() {
        Console console = System.console();
        String answer = "";
        do {
            System.out.print("Are you sure you want to logout? (y/n) ");
        } while (answer != "y" || answer != "n");

        if (answer == "y") {
            this.loggedIn = false;
        } else {
            return;
        }
    }
}
