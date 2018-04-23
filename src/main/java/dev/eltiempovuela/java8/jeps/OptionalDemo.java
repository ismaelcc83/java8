package dev.eltiempovuela.java8.jeps;

import java.util.Optional;

// Optional - Java 8
public class OptionalDemo {

  public static void execute() {
    System.out.println("Optional - Java 8");
    System.out.println("=================");

    Optional<String> name = Optional.of("Ismael");
    Optional<String> emptyName = Optional.empty();

    System.out.println(name.orElse("Unknown"));
    System.out.println(emptyName.orElse("Unknown"));
  }
}
