package dev.eltiempovuela.java8.jeps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Jep150Test {

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
  void shouldPrintCurrentDateAndFormattedDateTime() {
    Jep150.execute();

    String output = outputStream.toString();

    assertTrue(output.contains("JEP 150 - Date and Time API"));
    assertTrue(output.contains("Today: " + LocalDate.now()));
    assertTrue(output.matches("(?s).*Now: \\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}.*"));
  }
}
