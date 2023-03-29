import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("adam", "peter");
        System.out.println(p1);

        String dogSentence = "This dogy sentence is full of dogs. I love dogs. They (yes, dogs) are so cute.";
        System.out.println(replaceDogs(dogSentence));

        String trailingSpaceText = "   alphabet ";
        System.out.println(trailingSpaceText.strip());

        String weirdText = " alphabet ";
        System.out.println(stripAndCapitalizeLast(weirdText));

        String address = "12345 Big St., Alphabet City, CA 90210";
        String[] addressParts = splitAddress(address);
        System.out.println(Arrays.toString(addressParts));
    }

    static String replaceDogs(String textWithDogs) {
        return textWithDogs.replace("dog", "cat");
    }

    static String stripAndCapitalizeLast(String text) {
        String strippedText = text.strip();
        String formattedText1 = strippedText.substring(0, strippedText.length() - 1);
        String formattedText2 = strippedText.substring(strippedText.length() - 1).toUpperCase();
        return formattedText1 + formattedText2;
    }

    static String[] splitAddress(String address) {
        List<String> addressParts = Arrays.stream(address.split(",")).map(String::strip).toList();
        String part1 = addressParts.get(0);
        String part2 = addressParts.get(1);
        String part3 = addressParts.get(2);

        String buildingNumber = part1.substring(0, part1.indexOf(" "));
        String street = part1.substring(part1.indexOf(" ") + 1);
        String city = part2;
        String state = part3.substring(0, part3.indexOf(" "));
        String postalCode = part3.substring(part3.indexOf(" ") + 1);

        return new String[]{buildingNumber, street, city, state, postalCode};
    }
}