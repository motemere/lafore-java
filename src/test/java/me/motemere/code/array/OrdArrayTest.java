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

  @SuppressWarnings("MagicNumber")
  @Test
  void findValueByBinarySearch() {
    long[] arr = {1, 6, 3, 8, 12, 55, 73, 9, 4, 6, 17, 22, 46};
    OrdArray ordArray = new OrdArray(arr);
    assertEquals(ordArray.find(55L), 11);
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
