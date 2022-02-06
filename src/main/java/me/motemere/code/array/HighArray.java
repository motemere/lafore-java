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
   * Getter for array.
   *
   * @return arr long[]
   */
  public long[] getArr() {
    return arr;
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
    var newArray = new long[len + 1];
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
    var newArray = new long[len - 1];

    var targetIdx = 0;

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
    var max = Long.MIN_VALUE;

    for (int i : IntLoopHandler.range(0, len)) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return arr.length == 0 ? -1 : max;
  }

  /**
   * Find and delete max value in array.
   *
   * @return max  long
   */
  public long removeMax() {
    var max = getMax();
    delete(max);
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
