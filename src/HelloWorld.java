import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you");

        Person adam = new Person("Adam", "Petržela", LocalDate.of(2005, 6, 22));
//        Person amy = new Person();
        System.out.println(adam);
    }
}
