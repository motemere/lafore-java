package me.motemere.code.array;

import me.motemere.code.utils.IntLoopHandler;

public class HighArrayWithSortByChange extends HighArray {

  private final long[] sortedArr;

  public HighArrayWithSortByChange(long[] newArray) {
    super(newArray);
    sortedArr = new long[newArray.length];
    sortByChange();
  }

  /**
   * Sort by change.
   */
  private void sortByChange() {

    for (int i : IntLoopHandler.rangeReversedClosed(sortedArr.length, 0)) {
      if (super.getArr().length == 0) {
        break;
      }

      sortedArr[i] = removeMax();
    }
  }

  /**
   * Getter for sortedArr.
   *
   * @return the sortedArr
   */
  public long[] getSortedArr() {
    return sortedArr;
  }
}
