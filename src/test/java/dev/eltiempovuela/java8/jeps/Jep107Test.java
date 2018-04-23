package dev.eltiempovuela.java8.jeps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Jep107Test {

  @Test
  void shouldFilterNamesLongerThanFourCharactersAndConvertThemToUppercase() {
    List<String> names = Arrays.asList("Silvia", "Eric", "Chloe");

    List<String> result = Jep107.filterAndUppercaseNamesLongerThanFour(names);

    assertEquals(Arrays.asList("SILVIA", "CHLOE"), result);
  }

  @Test
  void shouldReturnEmptyListWhenNoNameHasMoreThanFourCharacters() {
    List<String> names = Arrays.asList("Eric", "Ana", "Marc");

    List<String> result = Jep107.filterAndUppercaseNamesLongerThanFour(names);

    assertEquals(Collections.emptyList(), result);
  }

  @Test
  void shouldReturnEmptyListWhenInputListIsEmpty() {
    List<String> result = Jep107.filterAndUppercaseNamesLongerThanFour(Collections.emptyList());

    assertEquals(Collections.emptyList(), result);
  }
}
