import java.util.ArrayList;

public class Exercises {

    public static final String[] DAYS = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        outputDAYS1();
        outputDAYS2();
        outputDAYS3();
        outputMeals1();
        outputMeals2();
        System.out.println(countLettersInWeek());
    }

    static void outputDAYS1() {
        for (int i = 0; i < DAYS.length; i++) {
            System.out.println(DAYS[i]);
        }
    }

    static void outputDAYS2() {
        for (String day : DAYS) {
            System.out.println(day);
        }
    }

    static void outputDAYS3() {
        for (int i = 0; i < DAYS.length; i++) {
            String day = i % 2 == 0 ? DAYS[i] : DAYS[i].toUpperCase();
            System.out.println(day);
        }
    }

    static void outputMeals1() {
        for (String day : DAYS) {
            String food;
            if (day.equals("Monday")) {
                food = "spaghetti";
            } else if (day.equals("Tuesday")) {
                food = "tacos";
            } else if (day.equals("Wednesday")) {
                food = "chicken";
            } else if (day.equals("Thursday")) {
                food = "meatloaf";
            } else if (day.equals("Friday")) {
                food = "hamburgers";
            } else if (day.equals("Saturday")) {
                food = "pizza";
            } else {
                food = "pot roast";
            }
            System.out.printf("We eat %s on %s.%n", food, day);
        }
    }

    static void outputMeals2() {
        for (String day : DAYS) {
            String food = switch (day) {
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "pot roast";
            };
            System.out.printf("We eat %s on %s.%n", capitalizeWords(food), day);
        }
    }

    private static String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static String capitalizeWords(String words) {
        //String[] splitWords = words.split(" ");
        //StringBuilder newWords = new StringBuilder(words.length());
//
        //for (String word : splitWords) {
        //    newWords.append(capitalizeWord(word));
        //    if (!word.equals(splitWords[splitWords.length - 1])) { //if it's not the last word
        //        newWords.append(" ");
        //    }
        //}
        //return newWords.toString();
        String[] splitWords = words.split(" ");
        ArrayList<String> capitalizedWords = new ArrayList<>(splitWords.length);
        for (String word : splitWords) {
            capitalizedWords.add(capitalizeWord(word));
        }
        return String.join(" ", capitalizedWords.toArray(new String[0])); //pass an empty String array to specify the array type
    }

    static int countLettersInWeek() {
        int numberOfCharacters = 0;
        for (String day : DAYS) {
            numberOfCharacters += day.length();
        }
        return numberOfCharacters;
    }
}
