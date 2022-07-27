package ru.netology.stats;

public class StatsService {

    public long getSumAmount(long sales[]) { // Считаем сумму всех продаж

        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long getAvgSum(long sales[]) { // Считаем среднюю сумму продаж в месяц

        return getSumAmount(sales) / 12;
    }

    public int maxSalesMonth(long sales[]) { // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long sales[]) { // Номер месяца, в котором был спад продаж (осуществлены продажи на минимальную сумму)

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthNumberLow(long sales[]) { // Кол-во месяцев, в которых продажи были ниже среднего

        int count = 0;
        long avg = getAvgSum(sales);

        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }


    public int monthNumberHigh(long sales[]) { // Кол-во месяцев, в которых продажи были выше среднего

        int count = 0;
        long avg = getAvgSum(sales);

        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}