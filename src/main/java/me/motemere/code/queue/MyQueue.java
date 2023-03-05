package me.motemere.code.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
  private final List<String> list;

  public MyQueue() {
    this.list = new ArrayList<>();
  }

  public MyQueue(List<String> list) {
    this.list = list;
  }

  public void push(String value) {
    list.add(value);
  }

  public String pop() {
    return list.remove(0);
  }

  public String peek() {
    return list.get(0);
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public void flush() {
    list.clear();
  }

}
