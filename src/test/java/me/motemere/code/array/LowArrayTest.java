package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LowArrayTest {

  private LowArray arr;
  static final int LENGTH_OF_ARR = 10;

  @BeforeEach
  void setUp() {
    arr = new LowArray(LENGTH_OF_ARR);

    arr.setElement(0, 1);
  }

  @Test
  @DisplayName("Set element")
  void setElement() {
    arr.setElement(0, 1);
    assertEquals(1, arr.getElement(0));
  }

  @Test
  @DisplayName("Get element")
  void getElement() {
    assertEquals(1, arr.getElement(0));
  }

  @Test
  @DisplayName("Search element by idx")
  void searchByIdx() {
    assertEquals(1, arr.searchByIdx(0));
  }

  @Test
  @DisplayName("Delete element by idx")
  void deleteByIdx() {
    assertEquals(-1, arr.deleteByIdx(0));
  }
}
