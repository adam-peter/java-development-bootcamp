import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName = "Christopher";
    public String lastName;
    protected LocalDate dob;

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
        Person p1 = new Person();
        p1.firstName = "Jake"; //main method is a member of Person -> can access private fields
        p1.lastName = "Smith";
        p1.sayHello();
        p1.saySomething("My groovy message!");
        p1.saySomething("My other message!");

        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5, 3));
    }
}