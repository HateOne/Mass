package ru.netology.javaqa.massive.services;

public class CalcService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int amountOfSales(int[] sales) {

        int amount = sales[0];
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];

        }

        return sum;


    }

    public int averageAmountOfSales(int[] sales) {

        int amount = sales[0];
        int sum = 0;
        int avarage = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            avarage = sum / 12;


        }
        return avarage;
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public int minAverageAmountOfSales(int[] sales) {

        int moth = 0;
        int avarageSales = averageAmountOfSales(sales);
        for ( int i =0; i < sales.length; i++){
            if (sales[i] < averageAmountOfSales(sales)){
                moth++;
            }

        }
        return moth;



    }
    public int msxAverageAmountOfSales(int[] sales) {

        int moth = 0;
        int avarageSales = averageAmountOfSales(sales);
        for ( int i =0; i < sales.length; i++){
            if (sales[i] > averageAmountOfSales(sales)){
                moth++;
            }

        }
        return moth ;
}}



















