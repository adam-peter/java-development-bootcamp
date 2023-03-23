public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple"; //String litteral
        String anotherFruit = "apple"; //stores the address of the already existing String object
        String vegetable = new String("broccoli"); //new keyword
        String anotherVegetable = new String("broccoli"); //allocates new space for the new String object

        System.out.println(fruit == anotherFruit); //does it have the same address? true
        System.out.println(vegetable == anotherVegetable); //false

    }
}
