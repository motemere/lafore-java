package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdArrayTest {

  private OrdArray array;

  @BeforeEach
  void setUp() {
    long[] newArray = {0, 1, 2, 1, 0};
    array = new OrdArray(newArray);
  }

  @Test
  void getArr() {
    long[] arr = {0, 0, 1, 1, 2};
    assertArrayEquals(array.getArr(), arr);
  }

  @Test
  void getLen() {
    long[] arr = {0, 0, 1, 1, 2};
    assertEquals(array.getLen(), arr.length);
  }
}