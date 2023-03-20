import java.util.Date;

public class Kitty {
    public static void main(String[] args) {
        Kitty fous = new Kitty("Fous", "domestic shorthair", Colors.BLACK, new Date("2020/01/01"));

        fous.getNametag();
        fous.meow();
        System.out.println(fous.name + " is " + fous.getAge() + " years old!");
    }

    private String name;
    private String breed;
    private Colors color;
    private final Date date;

    enum Colors {
        BLACK, WHITE, BROWN, GREY, ORANGE, TABBY, CALICO, TORTOISESHELL
    }

    public Kitty(String name, String breed, Colors color, Date date) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.date = date;
        System.out.println("Kitty " + this.name + " initialized!");
    }

    public void getNametag() {
        System.out.println("----");
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Color: " + this.color);
        System.out.println("Date of birth: " + this.date.toString());
        System.out.println("----");
    }

    public void meow() {
        System.out.println("MEOOWWWW");
    }

    public int getAge() {
        Date today = new Date();
        return today.getYear() - this.date.getYear();
    }
}
