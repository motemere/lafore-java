package me.motemere.code.array;

public class LowArray {

  private final long[] arr;

  public LowArray(int size) {
    arr = new long[size];
  }

  /**
   * Set element in array by idx.
   *
   * @param idx int
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
   * @throws IndexOutOfBoundsException  if index is out there
   */
  public long searchByIdx(int idx) throws IndexOutOfBoundsException {
    if (!isExist(idx)) {
      throw new IndexOutOfBoundsException("Index not found!");
    }

    long result = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i == idx) {
        result = arr[i];
      }
    }

    return result;
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

    for (int i = idx; i < arr.length - 1; i++) {
      this.setElement(i, this.getElement(i + 1));
    }

    return -1;
  }

  private boolean isExist(int idx) {
    if (idx > arr.length - 1) {
      return false;
    }

    return arr[idx] != 0;
  }
}
