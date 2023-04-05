package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMonthMaxSales() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calculateMonthMaxSales(maxMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMonthMinSales() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        int actual = service.calculateMonthMinSales(minMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        int[] amountMonthUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.calculateMonthsAboveAverageSales(amountMonthUnderAvg);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        int[] amountMonthOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.calculateMonthsAboveAverageSales(amountMonthOverAvg);

        Assertions.assertEquals(expected, actual);

    }


//    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void testSalesAmount(String salesData) {
//        StatsService service = new StatsService();
//        int[] sales = Arrays.stream(salesData.split(", "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        int expected = 180; // здесь указываем ожидаемое значение
//        int actual = service.calculateSalesAmount(sales);
//        Assertions.assertEquals(expected, actual);
//    }


//    @ParameterizedTest
//    @CsvSource({
//            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18",
//    })
//    public void testSalesAmount(String salesData, int expected) {
//        int[] sales = Arrays.stream(salesData.split(", ")).mapToInt(Integer::parseInt).toArray();
//        StatsService service = new StatsService();
//        int actual = service.calculateSalesAmount(sales);
//        Assertions.assertEquals(expected, actual);
//    }


//    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void testAverageSalesAmount(String salesData) {
//        int[] sales = Arrays.stream(salesData.split(", "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        StatsService service = new StatsService();
//        float expected = 15.0f; // здесь указываем ожидаемое значение
//        float actual = service.calculateAverageSalesAmount(sales);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void testMaxSalesMonth(String salesData) {
//        int[] sales = Arrays.stream(salesData.split(", "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        StatsService service = new StatsService();
//        int expected = 8; // здесь указываем ожидаемое значение
//        int actual = service.calculateMaxSalesMonth(sales);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void testMinSalesMonth(String salesData) {
//        int[] sales = Arrays.stream(salesData.split(", "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        StatsService service = new StatsService();
//        int expected = 9; // здесь указываем ожидаемое значение
//        int actual = service.calculateMinSalesMonth(sales);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void testSalesBelowAverage(String salesData) {
//        int[] sales = Arrays.stream(salesData.split(", "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        StatsService service = new StatsService();
//        int expected = 5; // здесь указываем ожидаемое значение
//        int actual = service.calculateSalesBelowAverage(sales);
//        Assertions.assertEquals(expected, actual);
//    }

}