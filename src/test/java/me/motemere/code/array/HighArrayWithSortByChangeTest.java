package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("MagicNumber")
class HighArrayWithSortByChangeTest {

  private HighArrayWithSortByChange highArray;

  @BeforeEach
  void setUp() {
    long[] newArray = {3, 1, 2, -2, 5};
    highArray = new HighArrayWithSortByChange(newArray);
  }

  @Test
  @DisplayName("Get sorted array")
  void getSortedArr() {
    long[] expected = {-2, 1, 2, 3, 5};
    long[] actual = highArray.getSortedArr();
    assertArrayEquals(expected, actual);
  }
}
