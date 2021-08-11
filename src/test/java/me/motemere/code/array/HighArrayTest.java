package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HighArrayTest {

  private HighArray arr;

  @BeforeEach
  void setUp() {
    long[] newArray = {0, 1, 2};
    arr = new HighArray(newArray);
  }

  @Test
  void find() {
    assertTrue(arr.find(1));
  }

  @Test
  void insert() {
  }

  @Test
  void delete() {
  }
}
