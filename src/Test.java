import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        int days = calculateDaysBetweenDates(LocalDate.of(2005, 6, 22), LocalDate.of(2023, 3, 19));
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println("You have lived for " + years + " years and " + remainingDays + " days.");
    }

    static int calculateDaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }
}
