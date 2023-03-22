package bank;

import bank.inner.Bank;

import java.util.UUID;

public class Customer extends Person {
    private String firstName;
    private String lastName;
    public Bank usedBank;

    public Customer(String firstName, String lastName, Bank usedBank) {
        super.id = "C" + UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.usedBank = usedBank;
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

    public Bank getUsedBank() {
        return usedBank;
    }

    public void setUsedBank(Bank usedBank) {
        this.usedBank = usedBank;
    }
}

