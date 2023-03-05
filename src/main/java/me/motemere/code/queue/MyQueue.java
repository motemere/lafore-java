package me.motemere.code.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Queue implementation.
 */
public class MyQueue {

  /**
   * List of strings.
   */
  private final List<String> list;

  /**
   * Create empty queue.
   */
  public MyQueue() {
    this.list = new ArrayList<>();
  }

  /**
   * Create queue from list.
   *
   * @param strings list of strings
   */
  public MyQueue(List<String> strings) {
    this.list = strings;
  }

  /**
   * Add value to the end of the queue.
   *
   * @param value value to add
   */
  public void push(String value) {
    list.add(value);
  }

  /**
   * Remove value from the beginning of the queue.
   *
   * @return value from the beginning of the queue
   */
  public String pop() {
    return list.remove(0);
  }

  /**
   * Get value from the beginning of the queue.
   *
   * @return value from the beginning of the queue
   */
  public String peek() {
    return list.get(0);
  }

  /**
   * Check if queue is empty.
   *
   * @return true if queue is empty, false otherwise
   */
  public boolean isEmpty() {
    return list.isEmpty();
  }

  /**
   * Remove all values from the queue.
   */
  public void flush() {
    list.clear();
  }

}
