package com.bitcamp.test3;

public class App {
  public String getGreeting() {
    return "Hello Java!";
  }
<<<<<<< HEAD

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println("경도현");
=======

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println("점심시간에 잠깐 회의할까요");

    for (int i = 0; i < 5; i++) {

      System.out.println(new App().getGreeting());
      System.out.println("ddddddddddddddddddddddddddddddddd");
      System.out.println(new App().getGreeting());

      for (i = 0; i < 5; i++) {
        System.out.println(i);
      }
    }
>>>>>>> ef847f4b34d770895e0fe5c25caa2c7861d69e8f
  }
}
