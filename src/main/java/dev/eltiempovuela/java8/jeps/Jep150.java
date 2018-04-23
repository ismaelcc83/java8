package dev.eltiempovuela.java8.jeps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// JEP 150 - Date and Time API
public class Jep150 {

  public static void execute() {
    System.out.println("JEP 150 - Date and Time API");
    System.out.println("===========================");

    LocalDate today = LocalDate.now();
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Today: " + today);
    System.out.println("Now: " + now.format(formatter));
  }
}
