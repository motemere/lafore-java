package me.motemere.code.array;

import java.util.Arrays;
import me.motemere.code.utils.IntLoopHandler;

public class OrdArray {

  private final long[] arr;
  private final int len;

  public OrdArray(long[] newArray) {
    this.arr = newArray;
    this.len = newArray.length;
    sort();
  }

  /**
   * Binary search value in array.
   *
   * @param value long
   * @return int index of value
   */
  public int find(long value) {

    var firstIdx = 0;
    var lastIdx = len - 1;

    while (firstIdx <= lastIdx) {
      var middleIdx = (firstIdx + lastIdx) / 2;

      if (arr[middleIdx] == value) {
        return middleIdx;
      }

      if (arr[middleIdx] < value) {
        firstIdx = middleIdx + 1;
      }

      if (arr[middleIdx] > value) {
        lastIdx = middleIdx - 1;
      }
    }

    return -1;
  }

  /**
   * Bubble sort arr.
   */
  private void sort() {
    for (int i : IntLoopHandler.range(0, arr.length)) {
      for (int j : IntLoopHandler.range(0, arr.length)) {
        if (arr[i] < arr[j]) {
          var temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
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
   * Getter for array.
   *
   * @return length of arr in int
   */
  public int getLen() {
    return len;
  }

  /**
   * Display array contents.
   *
   * @return String contents
   */
  @Override
  public String toString() {
    return "OrdArray{"
        + "arr="
        + Arrays.toString(arr)
        + ", len="
        + len
        + '}';
  }
}
