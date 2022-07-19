package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @ParameterizedTest
    @CsvSource({
            "180"
    })
    public void testSumAmount(int expected) {
        StatsService service = new StatsService();

        double actual = service.getSumAmount();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "15"
    })
    public void getAvgSum(int expected) {
        StatsService service = new StatsService();

        double actual = service.getAvgSum();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8"
    })
    public void maxSalesMonth(int expected) {
        StatsService service = new StatsService();

        int actual = service.maxSalesMonth();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9"
    })
    public void minSalesMonth(int expected) {
        StatsService service = new StatsService();

        int actual = service.minSalesMonth();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5"
    })
    public void monthNumberLow(int expected) {
        StatsService service = new StatsService();

        int actual = service.monthNumberLow();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5"
    })
    public void monthNumberHigh(int expected) {
        StatsService service = new StatsService();

        int actual = service.monthNumberHigh();

        Assertions.assertEquals(expected, actual);

    }

}
