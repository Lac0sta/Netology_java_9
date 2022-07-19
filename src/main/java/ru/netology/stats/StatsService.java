package ru.netology.stats;

public class StatsService {

    public double getSumAmount() { // Считаем сумму всех продаж
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double getAvgSum() { // Считаем среднюю сумму продаж в месяц
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double avg = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            avg = sum / sales.length;
        }
        return avg;
    }

    public int maxSalesMonth() { // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth() { // Номер месяца, в котором был спад продаж (осуществлены продажи на минимальную сумму)*
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthNumberLow() { // Кол-во месяцев, в которых продажи были ниже среднего
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avg = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            avg = sum / sales.length;
        }
        int lowerMonth = 0;
        for (double sale : sales) {
            if (sale < avg) {
                lowerMonth++;
            }
        }
        return lowerMonth;
    }


    public int monthNumberHigh() { // Кол-во месяцев, в которых продажи были выше среднего
        double sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int avg = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            avg = sum / sales.length;
        }
        int higherMonth = 0;
        for (double sale : sales) {
            if (sale > avg) {
                higherMonth++;
            }
        }
        return higherMonth;

    }
}