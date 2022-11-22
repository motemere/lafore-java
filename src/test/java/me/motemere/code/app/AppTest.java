package me.motemere.code.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {

  @Test
  @DisplayName("Main method")
  void main() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    App.main(null);

    String expected = String.format(
        "Hello, World from '%s' and special thx for Robert W. Lafore.",
        App.class
    );

    assertEquals(expected, outContent.toString().trim());
  }
}
