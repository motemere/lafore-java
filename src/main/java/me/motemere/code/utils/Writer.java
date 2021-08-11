package me.motemere.code.utils;

/**
 * Wrapper on sout.
 */
public interface Writer {

  /**
   * Write line.
   *
   * @param out String.
   */
  default void writeLine(String out) {
    System.out.println(out);
  }

  /**
   * Write string.
   *
   * @param out String.
   */
  default void writeString(String out) {
    System.out.print(out);
  }
}
