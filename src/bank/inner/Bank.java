package bank.inner;

import bank.Person;

public class Bank {
    private String name;
    private String designColor;
    protected long vault;

    public Bank(String name, String designColor) {
        this.name = name;
        this.designColor = designColor;
        this.vault = 0;
    }

    public String getName() {
        return name;
    }

    public String getDesignColor() {
        return designColor;
    }

    public long getVault() {
        return vault;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    protected void setVault(long vault) {
        this.vault = vault;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", designColor='" + designColor + '\'' +
                ", vault=" + vault +
                '}';
    }

    //------
    private boolean hasRights(Person p) {
        if (!(p.id.startsWith("BM"))) {
            System.out.println("You don't have the rights to do that!");
            return false;
        }
        return true;
    }

    public void deposit(long money, Person p) {
        if (!(hasRights(p))) {
            return;
        }

        if (money > 0) {
            this.vault += money;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Can't deposit negative ammount.");
        }
    }

    public long withdraw(long money, Person p) {
        if (!(hasRights(p))) {
            return 0;
        }

        if (!(money > vault)) {
            System.out.println("Withdrawal successful!");
            vault -= money;
            return money;
        } else {
            System.out.println("You can't withdraw that ammount.");
            return 0;
        }
    }
}
