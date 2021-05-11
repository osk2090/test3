package com.bitcamp.test3;

public class App {
  public String getGreeting() {
    return "Hello Java!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println("이클립스로 푸쉬!");
    System.out.println("점심시간에 잠깐 회의할까요");
    System.out.println("점심시간에요...?");
    System.out.println("경도현");
    System.out.println("zzzzzz");

    for (int i = 0; i < 5; i++) {

      System.out.println(new App().getGreeting());
      System.out.println("ddddddddddddddddddaddddddddddddddd");
      System.out.println(new App().getGreeting());

      for (i = 0; i < 5; i++) {
        System.out.println(i);
      }
    }
  }
}
