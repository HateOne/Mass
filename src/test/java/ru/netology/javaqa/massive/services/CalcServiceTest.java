package ru.netology.javaqa.massive.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest{

  @Test
 public void shouldFindMinSalesForMoth() {

   CalcService service = new CalcService();

   int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

   int expectedMoth = 9;
   int actualMoth = service.minSales(minSales);

   Assertions.assertEquals(expectedMoth, actualMoth);


  }

  @Test
    public void shouldAmountOfSales () {

      CalcService service = new CalcService();

      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

      int expectedSum = 180;
      int actualSum = service.amountOfSales(sales);

      Assertions.assertEquals(expectedSum, actualSum);


  }

  @Test
    public void shouldAvargeAmountOfSales (){

      CalcService service = new CalcService();

      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

      int expectedAvarage = 15;
      int actualAvarage = service.averageAmountOfSales(sales);

      Assertions.assertEquals(expectedAvarage, actualAvarage);


  }

  @Test
  public void shouldFindMaxSalesForMoth(){

      CalcService service = new CalcService();

      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

      int expectedMoth = 8;
      int actualMoth = service.maxSales(sales);

      Assertions.assertEquals(expectedMoth, actualMoth);

  }

@Test
public void shouldFindMinAvrageAmountForMoth() {

    CalcService service = new CalcService();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int expectedMoth = 5;
    int actualMoth = service.minAverageAmountOfSales(sales);

    Assertions.assertEquals(expectedMoth, actualMoth);
}

@Test
public void shouldFindMaxAvrageAmountForMoth(){

    CalcService service = new CalcService();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int expectedMoth = 5;
    int actualMoth = service.msxAverageAmountOfSales(sales);

    Assertions.assertEquals(expectedMoth, actualMoth);


}







}


