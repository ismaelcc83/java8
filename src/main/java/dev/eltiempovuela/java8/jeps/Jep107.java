package dev.eltiempovuela.java8.jeps;

import java.util.List;
import java.util.stream.Collectors;

// JEP 107 - Bulk Data Operations for Collections
public class Jep107 {

  public static List<String> filterAndUppercaseNamesLongerThanFour(List<String> names) {
    return names.stream()
        .filter(name -> name.length() > 4)
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  public static void execute() {
    System.out.println("JEP 107 - Streams");
    System.out.println("=================");

    List<String> names = java.util.Arrays.asList("Silvia", "Eric", "Chloe");
    List<String> result = filterAndUppercaseNamesLongerThanFour(names);

    System.out.println(result);
  }
}
