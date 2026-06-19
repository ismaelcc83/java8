package dev.eltiempovuela.java8.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultMethodsTest {

  private final PrintStream originalOut = System.out;
  private ByteArrayOutputStream outputStream;

  @BeforeEach
  void setUp() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void shouldPrintMessagesUsingDefaultInterfaceMethod() {
    DefaultMethods.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("Default Methods - Java 8"));
    assertTrue(output.contains("Hello Ismael"));
    assertTrue(output.contains("Goodbye Ismael"));
  }
}
