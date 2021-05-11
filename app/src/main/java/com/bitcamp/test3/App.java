package com.bitcamp.test3;

public class App {
  public String getGreeting() {
    return "Hello Java!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println("집가고싶다!!!");

    for (

        int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
