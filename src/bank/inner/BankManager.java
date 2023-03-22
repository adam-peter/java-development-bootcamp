package bank.inner;

import bank.Person;

import java.util.UUID;

public class BankManager extends Person {
    private String firstName;
    private String lastName;
    public Bank managedBank;

    public BankManager(String firstName, String lastName, Bank managedBank) {
        super.id = "BM" + UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.managedBank = managedBank;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Bank setManagedBank() {
        return managedBank;
    }

    public void setManagedBank(Bank bank) {
        this.managedBank = bank;
    }
}

