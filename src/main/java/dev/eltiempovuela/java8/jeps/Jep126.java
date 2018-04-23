package dev.eltiempovuela.java8.jeps;

import java.util.Arrays;
import java.util.List;

// JEP 126 - Lambda Expressions
public class Jep126 {

  public static void execute() {
    System.out.println("JEP 126 - Lambda Expressions");
    System.out.println("============================");

    List<String> names = Arrays.asList("Silvia", "Eric", "Chloe");

    names.forEach(name -> System.out.println("Hello " + name));
  }
}
