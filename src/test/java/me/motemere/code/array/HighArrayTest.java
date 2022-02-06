package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HighArrayTest {

  private HighArray arr;

  @BeforeEach
  void setUp() {
    arr = new HighArray(new long[]{0, 1, 2});
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

  @Test
  @DisplayName("Find max")
  void getMax() {
    assertEquals(arr.getMax(), 2L);
  }

  @Test
  @DisplayName("Find max in empty array")
  void getMaxInEmptyArr() {
    var newArray = new long[]{};
    arr = new HighArray(newArray);
    assertEquals(arr.getMax(), -1L);
  }

  @Test
  @DisplayName("Find and delete max")
  void removeMax() {
    long max = arr.removeMax();
    assertFalse(arr.find(max));
  }
}
