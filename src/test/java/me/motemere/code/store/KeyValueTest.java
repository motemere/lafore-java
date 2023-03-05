package me.motemere.code.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeyValueTest {

  private KeyValue keyValue;

  @BeforeEach
  void setUp() {
    keyValue = new KeyValue("key", "value");
  }

  @Test
  void getKey() {
    assertEquals("key", keyValue.getKey());
  }

  @Test
  void getValue() {
    assertEquals("value", keyValue.getValue());
  }

  @Test
  void setKey() {
    keyValue.setKey("newKey");
    assertEquals("newKey", keyValue.getKey());
  }

  @Test
  void setValue() {
    keyValue.setValue("newValue");
    assertEquals("newValue", keyValue.getValue());
  }

  @Test
  void testToString() {
    assertEquals("KeyValue{key='key', value='value'}", keyValue.toString());
  }
}
