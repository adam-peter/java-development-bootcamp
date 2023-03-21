import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName = "Christopher";
    private String lastName;
    private LocalDate dob;

//    private Person() {} -no-args constructor

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }

    public void sayHello() {
        System.out.println("Hello from Person!");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return this.middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
    }
}