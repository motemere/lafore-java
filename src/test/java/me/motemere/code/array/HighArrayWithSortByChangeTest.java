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
    highArray = new HighArrayWithSortByChange(new long[]{3, 1, 2, -2, 5});
  }

  @Test
  @DisplayName("Get sorted array")
  void getSortedArr() {
    var expected = new long[]{-2, 1, 2, 3, 5};
    var actual = highArray.getSortedArr();
    assertArrayEquals(expected, actual);
  }
}
