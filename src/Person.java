public class Person {
    private String middleName = "Christopher";

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message!");
        p1.saySomething("My other message!");

        System.out.println(p1.getMiddleInitial());

        p1.test(new String[]{"one", "two", "three"}); //array without declaration
        p1.test2("one", "two", "three", "four");
        p1.test3(1, 2, new String[]{"hello", "friend!"});
        p1.test4(1, 2, "a", "b", "c");
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

    public void test(String[] words) {
        //do something clever with words
    }

    public void test2(String... words) { //words is a vararg
        //do something very clever with words
    }

    public void test3(int num1, int num2, String[] words) {
        //do something very clever with words
    }

    public void test4(int num1, int num2, String... words) { //works with arguments in front of the vararg
        //do something very clever with words
    }
}