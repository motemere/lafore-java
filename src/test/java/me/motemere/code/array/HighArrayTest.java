package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HighArrayTest {

  private HighArray arr;

  @BeforeEach
  void setUp() {
    long[] newArray = {0, 1, 2};
    arr = new HighArray(newArray);
  }

  @Test
  @DisplayName("Find value")
  void find() {
    assertTrue(arr.find(1));
  }

  @Test
  @DisplayName("Insert value")
  void insert() {
    assertTrue(arr.insert(1));
  }

  @Test
  @DisplayName("Delete value")
  void delete() {
    assertTrue(arr.delete(2));
  }
}
