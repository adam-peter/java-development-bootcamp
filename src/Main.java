import online.shop.Customer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Customer c1 = new Customer("Adam", "Peter", "badmood111");
//        System.out.println(c1.toString());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days.length);
        System.out.println(days[3]);

        int[] numbers = new int[10];
        for (int i = 1; i <= 10; i++) {
            numbers[i - 1] = i;
        }
        System.out.println(Arrays.toString(numbers));

        char[][] ticTacToe = {{'□', '□', '□'}, {'□', '□', '□'}, {'□', '□', '□'}};
        ticTacToe[2][2] = 'X';
        ticTacToe[1][1] = 'O';
        for (int i = 0; i < 3; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                line.append(ticTacToe[i][j]).append(" ");
            }
            System.out.println(line);
        }
//        System.out.println(Arrays.deepToString(ticTacToe));

        System.out.println(wordJoiner("Hello", "friend", "how", "are", "you?"));

        Car c1 = new Car("Bentley", "Continental GT", 2022, "black");
        System.out.println(c1);
    }

    static String wordJoiner(String... words) {
        StringBuilder joinedWords = new StringBuilder();
        for (String word : words) {
            joinedWords.append(word).append(" ");
        }
        return joinedWords.toString();
    }
}