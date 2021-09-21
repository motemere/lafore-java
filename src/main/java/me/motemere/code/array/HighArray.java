package me.motemere.code.array;

import java.util.Arrays;

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
    for (int i = 0; i < len; i++) {
      if (arr[i] == value) {
        return true;
      }
    }

    return false;
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

    for (int i = 0; i < len; i++) {
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
   * @return  max  long
   */
  public long getMax() {
    long max = -1;

    for (int i = 0; i < len; i++) {
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
