package me.motemere.code.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import me.motemere.code.utils.IntLoopHandler;

public class HighArray {

  private long[] arr;
  private int len;

  public HighArray(long[] newArray) {
    this.arr = newArray;
    this.len = newArray.length;
  }

  /**
   * Find value in array.
   *
   * @param value long
   * @return result boolean
   */
  public boolean find(long value) {
    return IntStream.range(0, len).anyMatch(i -> arr[i] == value);
  }

  /**
   * Insert new value to array.
   *
   * @param value long
   * @return result boolean
   */
  public boolean insert(long value) {
    long[] newArray = new long[len + 1];
    System.arraycopy(arr, 0, newArray, 0, len);

    newArray[len] = value;
    arr = newArray;

    len++;

    return arr[len - 1] == value;
  }

  /**
   * Delete value from array.
   *
   * @param value long
   * @return result boolean
   */
  public boolean delete(long value) {
    long[] newArray = new long[len - 1];

    int targetIdx = 0;

    for (int i : IntLoopHandler.range(0, len)) {
      if (arr[i] != value) {
        newArray[targetIdx] = arr[i];
        targetIdx++;
      }
    }

    arr = newArray;
    len--;

    return !find(value);
  }

  /**
   * Find max value in array.
   *
   * @return max  long
   */
  public long getMax() {
    long max = -1;

    for (int i : IntLoopHandler.range(0, len)) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }

  /**
   * Display array contents.
   *
   * @return String contents
   */
  @Override
  public String toString() {
    return "HighArray{"
        + "arr="
        + Arrays.toString(arr)
        + ", len="
        + len
        + '}';
  }
}
