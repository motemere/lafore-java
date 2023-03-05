package me.motemere.code.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

  private MyQueue queue;

  @BeforeEach
  void setUp() {
    queue = new MyQueue();
  }

  @Test
  void createFromList() {
    List<String> list = new ArrayList<>();
    list.add("Bob Marley - Redemption Song");
    list.add("Metallica - Nothing Else Matters");
    list.add("Frank Sinatra - Silver Bells");

    MyQueue queue = new MyQueue(list);

    assertEquals("Bob Marley - Redemption Song", queue.peek());
  }

  @Test
  void pushAndPeek() {
    queue.push("Bob Marley - Redemption Song");
    queue.push("Metallica - Nothing Else Matters");
    queue.push("Frank Sinatra - Silver Bells");
    assertEquals("Bob Marley - Redemption Song", queue.peek());
  }

  @Test
  void pop() {
    queue.push("Bob Marley - Redemption Song");
    queue.push("Metallica - Nothing Else Matters");
    queue.push("Frank Sinatra - Silver Bells");
    assertEquals("Bob Marley - Redemption Song", queue.pop());
  }

  @Test
  void isEmpty() {
    assertTrue(queue.isEmpty());
  }

  @Test
  void flush() {
    queue.push("Bob Marley - Redemption Song");
    queue.push("Metallica - Nothing Else Matters");
    queue.push("Frank Sinatra - Silver Bells");
    queue.flush();
    assertTrue(queue.isEmpty());
  }
}