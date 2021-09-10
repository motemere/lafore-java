package me.motemere.code.array;

import java.util.Arrays;

public class OrdArray {

  private long[] arr;
  private int len;

  public OrdArray(long[] newArray) {
    this.arr = newArray;
    this.len = newArray.length;
    sort();
  }

  /**
   * Bubble sort arr.
   */
  private void sort() {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          long temp = arr[i];
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
