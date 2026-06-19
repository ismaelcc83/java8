package dev.eltiempovuela.java8.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OptionalDemoTest {

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
  void shouldPrintPresentValueAndFallbackValueForEmptyOptional() {
    OptionalDemo.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("Optional - Java 8"));
    assertTrue(output.contains("Ismael"));
    assertTrue(output.contains("Unknown"));
  }
}
