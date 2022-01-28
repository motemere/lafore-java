package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HighArrayWithSortByChangeTest {

  HighArrayWithSortByChange highArray;

  @BeforeEach
  void setUp() {
    long[] newArray = {3, 1, 2};
    highArray = new HighArrayWithSortByChange(newArray);
  }

  @Test
  @DisplayName("Get sorted array")
  void getSortedArr() {
    long[] expected = {1, 2, 3};
    long[] actual = highArray.getSortedArr();
    assertArrayEquals(expected, actual);
  }
}