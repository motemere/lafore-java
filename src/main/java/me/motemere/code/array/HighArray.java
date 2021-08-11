package me.motemere.code.array;

import java.util.Arrays;

public class HighArray {

  private final long[] arr;
  private int len;
  private final int cap;

  public HighArray(long[] newArray) {
    this.arr = newArray;
    this.len = 0;
    this.cap = newArray.length;
  }

  /**
   * Find value in array.
   *
   * @param searchKey long
   * @return result boolean
   */
  public boolean find(long searchKey) {
    for (int i = 0; i < cap; i++) {
      if (arr[i] == searchKey) {
        return true;
      }
    }

    return false;
  }

  /**
   * Insert new value to array.
   *
   * @param value long
   * @return code int
   */
  public int insert(long value) {
    if (len < cap) {
      arr[len] = value;
      len++;
      return 0;
    }

    return 1;
  }

  /**
   * Delete value from array.
   *
   * @param value long
   * @return result boolean
   */
  public boolean delete(long value) {
    int idx;

    for (idx = 0; idx < len; idx++) {
      if (value == arr[idx]) {
        break;
      }
    }

    if (idx != len) {
      for (int i = idx; i < len; i++) {
        arr[i] = arr[i + 1];
      }

      len--;
      return true;
    }

    return false;
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
        + ", cap="
        + cap
        + '}';
  }
}
