package dev.eltiempovuela.java8.jeps;

// Default Methods - Java 8
public class DefaultMethods {

  public static void execute() {
    System.out.println("Default Methods - Java 8");
    System.out.println("========================");

    Greeter greeter = new ConsoleGreeter();

    greeter.sayHello("Ismael");
    greeter.sayGoodbye("Ismael");
  }

  private interface Greeter {

    void sayHello(String name);

    default void sayGoodbye(String name) {
      System.out.println("Goodbye " + name);
    }
  }

  private static class ConsoleGreeter implements Greeter {

    @Override
    public void sayHello(String name) {
      System.out.println("Hello " + name);
    }
  }
}
