import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class SolsticesTest {
    Solstices solstices = new Solstices();

    @Test
    void getSummerSolsticeCountdown() {
        String result = solstices.getSummerSolsticeCountdown(LocalDate.parse("2019-02-01"));
        String expected = "2019-06-21";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getSummerSolsticeCountdown2() {
        String result = solstices.getSummerSolsticeCountdown(LocalDate.parse("2019-10-01"));
        String expected = "2020-06-20";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getSummerSolsticeCountdown3() {
        String result = solstices.getSummerSolsticeCountdown(LocalDate.parse("2022-02-01"));
        String expected = "2022-06-21";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getSummerSolsticeCountdown4() {
        String result = solstices.getSummerSolsticeCountdown(LocalDate.parse("2023-02-01"));
        String expected = "2023-06-21";
        Assertions.assertEquals(expected, result);
    }


}