package me.motemere.code.utils;

import java.util.Iterator;

public class IntLoopHandler {

  /**
   * Returns a range of integers.
   *
   * @param fromInclusive initial value (inclusive).
   * @param toExclusive   final value (not included).
   * @return Iterable, containing numbers from fromInclusive to toExclusive.
   */
  public static Iterable<Integer> range(int fromInclusive, int toExclusive) {
    return () -> new Iterator<>() {
      private int cursor = fromInclusive;

      public boolean hasNext() {
        return cursor < toExclusive;
      }

      public Integer next() {
        return cursor++;
      }
    };
  }

  /**
   * Returns the reverse range of integers.
   *
   * @param fromInclusive initial value (inclusive).
   * @param toExclusive   final value (not included).
   * @return Iterable, containing numbers from fromInclusive to toExclusive.
   */
  public static Iterable<Integer> rangeReversed(int fromInclusive, int toExclusive) {
    return () -> new Iterator<>() {
      private int cursor = fromInclusive;

      public boolean hasNext() {
        return cursor > toExclusive;
      }

      public Integer next() {
        return cursor--;
      }
    };
  }

  /**
   * Returns the reverse range of integers from exclusive to inclusive.
   *
   * @param fromExclusive initial value (exclusive).
   * @param toInclusive   final value (included).
   * @return Iterable, containing numbers from fromInclusive to toExclusive.
   */
  public static Iterable<Integer> rangeReversedClosed(int fromExclusive, int toInclusive) {
    return () -> new Iterator<>() {
      private int cursor = fromExclusive - 1;

      public boolean hasNext() {
        return cursor >= toInclusive;
      }

      public Integer next() {
        return cursor--;
      }
    };
  }
}
