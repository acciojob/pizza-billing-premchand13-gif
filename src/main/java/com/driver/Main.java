package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
//    System.out.println(dp.getPrice());
    System.out.println(dp.getBill());
//    System.out.println(dp.getBill());


    Pizza p = new Pizza(true);

    p.addExtraToppings();
    p.addExtraCheese();
//    System.out.println(p.getPrice());
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}