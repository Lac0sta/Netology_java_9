package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumAmount() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        double actual = service.getSumAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAvgSum() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 15;
        double actual = service.getAvgSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maxSalesMonth() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minSalesMonth() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void monthNumberLow() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthNumberLow(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void monthNumberHigh() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthNumberHigh(sales);

        Assertions.assertEquals(expected, actual);

    }

}
