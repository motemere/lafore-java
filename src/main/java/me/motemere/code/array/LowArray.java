package me.motemere.code.array;

import java.util.stream.IntStream;
import me.motemere.code.utils.IntLoopHandler;

public class LowArray {

  private final long[] arr;

  public LowArray(int size) {
    arr = new long[size];
  }

  /**
   * Set element in array by idx.
   *
   * @param idx   int
   * @param value long
   */
  public void setElement(int idx, long value) {
    arr[idx] = value;
  }

  /**
   * Get element in array by idx.
   *
   * @param idx int
   * @return value long
   */
  public long getElement(int idx) {
    return arr[idx];
  }

  /**
   * Get length of array.
   *
   * @return length int
   */
  public int length() {
    return arr.length;
  }

  /**
   * Find value by idx.
   *
   * @param idx int
   * @return value long
   * @throws IndexOutOfBoundsException if index is out there
   */
  public long searchByIdx(int idx) throws IndexOutOfBoundsException {

    for (int i : IntLoopHandler.range(0, arr.length)) {
      if (i == idx) {
        return arr[i];
      }
    }

    throw new IndexOutOfBoundsException("Index not found!");
  }

  /**
   * Delete element by index and shift all elements left.
   *
   * @param idx int
   * @return status int
   * @throws IndexOutOfBoundsException if index is out there
   */
  public int deleteByIdx(int idx) throws IndexOutOfBoundsException {

    if (!isExist(idx)) {
      throw new IndexOutOfBoundsException("Index not found!");
    }

    IntStream.range(idx, arr.length - 1)
        .forEach(i -> this.setElement(i, this.getElement(i + 1)));

    return -1;
  }

  /**
   * Check if index is exist.
   *
   * @param idx int
   * @return status boolean
   */
  private boolean isExist(int idx) {
    return IntStream.range(0, arr.length).anyMatch(i -> i == idx);
  }
}
