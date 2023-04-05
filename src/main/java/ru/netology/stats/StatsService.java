package ru.netology.stats;

public class StatsService {

    public int calculateSalesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSalesAmount(int[] sales) {
        int sum = calculateSalesAmount(sales);
        return sum / sales.length;
    }

    public int calculateMonthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateMonthMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int calculateMonthsAboveAverageSales(int[] sales) {
        int count = 0;
        int average = calculateAverageSalesAmount(sales); // Системе легче производить рассчет
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverageSales(int[] sales) {
        int count = 0;
        int average = calculateAverageSalesAmount(sales);

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }


//    public int calculateMaxSalesMonth(int[] sales) {
//        int max = sales[0];
//        int maxMonth = 1;
//        for (int i = 1; i < sales.length; i++) {
//            if (sales[i] > max) {
//                max = sales[i];
//                maxMonth = i + 1;
//            }
//        }
//        return maxMonth;
//    }
//
//    public int calculateMinSalesMonth(int[] sales) {
//        int min = sales[0];
//        int minMonth = 1;
//        for (int i = 1; i < sales.length; i++) {
//            if (sales[i] < min) {
//                min = sales[i];
//                minMonth = i + 1;
//            }
//        }
//        return minMonth;
//    }
//
//    public int calculateSalesBelowAverage(int[] sales) {
//        int average = calculateSalesAmount(sales);
//        int count = 0;
//        for (int s : sales) {
//            if (s < average) {
//                count++;
//            }
//        }
//        return count;
//    }

//    public int acalculateSalesAboveAverage(int[] sales) {
//        int average = calculateSalesAmount(sales);
//        int count = 0;
//        for (int s : sales) {
//            if (s > average) {
//                count++;
//            }
//        }
//        return count;
//    }
}

