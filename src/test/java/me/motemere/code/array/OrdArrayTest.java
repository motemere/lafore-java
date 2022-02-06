package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("MagicNumber")
class OrdArrayTest {

  private long[] nominalArray;
  private OrdArray ordArray;

  @BeforeEach
  void setUp() {
    nominalArray = new long[]{1, 3, 4, 6, 6, 8, 9, 12, 17, 22, 46, 55, 73};
    ordArray = new OrdArray(new long[]{1, 6, 3, 8, 12, 55, 73, 9, 4, 6, 17, 22, 46});
  }

  @Test
  void findValueByBinarySearch() {
    assertEquals(ordArray.find(55L), Arrays.binarySearch(ordArray.getArr(), 55L));
  }

  @Test
  void getArr() {
    assertArrayEquals(ordArray.getArr(), nominalArray);
  }

  @Test
  void getLen() {
    assertEquals(ordArray.getLen(), nominalArray.length);
  }
}
