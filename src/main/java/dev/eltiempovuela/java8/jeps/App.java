package dev.eltiempovuela.java8.jeps;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int option;

    do {
      printMenu();

      System.out.print("Choose an option: ");
      option = readOption(scanner);

      System.out.println();

      switch (option) {
        case 1:
          Jep107.execute();
          break;
        case 2:
          Jep126.execute();
          break;
        case 3:
          Jep150.execute();
          break;
        case 4:
          OptionalDemo.execute();
          break;
        case 5:
          DefaultMethods.execute();
          break;
        case 0:
          System.out.println("Exiting application...");
          break;
        default:
          System.out.println("Invalid option. Please choose a valid example.");
          break;
      }

      System.out.println();

    } while (option != 0);

    scanner.close();
  }

  private static void printMenu() {
    System.out.println("======================================");
    System.out.println(" Java 8 Practical Exploration");
    System.out.println("======================================");
    System.out.println("1. JEP 107 - Streams");
    System.out.println("2. JEP 126 - Lambda Expressions");
    System.out.println("3. JEP 150 - Date and Time API");
    System.out.println("4. Optional");
    System.out.println("5. Default Methods");
    System.out.println("0. Exit");
    System.out.println("======================================");
  }

  private static int readOption(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Please enter a number: ");
      scanner.next();
    }

    return scanner.nextInt();
  }
}
