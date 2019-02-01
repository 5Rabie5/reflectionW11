import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solstices {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    LocalDate date1 = LocalDate.parse("June 20, 1972", formatter);

    public String getSummerSolsticeCountdown(LocalDate date) {
        if (date.isLeapYear()) {
            if (date.getDayOfMonth() < 21 && date.getMonthValue() < 6) {
                return date.getYear() + "-06-20";
            }
            return date.getYear() + 1 + "-06-20";
        } else {

            if (date.getDayOfMonth() < 21 && date.getMonthValue() < 6) {


                return date.getYear() + "-06-21";
            } else {
                if (date.plusYears(1).isLeapYear()) {

                    return date.getYear() + 1 + "-06-20";
                }
                return date.getYear() + 1 + "-06-21";
            }
        }
    }

    public String getWinterSolsticeCountdown(LocalDate date) {
        if ((date.getYear() - 1972) % 4 == 3) {
        }
        return "";
    }

}
