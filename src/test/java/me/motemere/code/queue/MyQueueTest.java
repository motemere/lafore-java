package me.motemere.code.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {

  private MyQueue queue;

  @BeforeEach
  void setUp() {
    queue = new MyQueue();
  }

  @Test
  void createFromList() {
    List<String> stringList = new ArrayList<>();
    stringList.add("Bob Marley - Redemption Song");
    stringList.add("Metallica - Nothing Else Matters");
    stringList.add("Frank Sinatra - Silver Bells");

    MyQueue myQueue = new MyQueue(stringList);

    assertEquals("Bob Marley - Redemption Song", myQueue.peek());
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
