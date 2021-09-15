package me.motemere.code.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

  private Person personMock;

  @BeforeEach
  void setUp() {
    personMock = mock(Person.class);
  }

  @Test
  void getFirstName() {
    assertNull(personMock.getFirstName());
  }

  @Test
  void getLastName() {
    assertNull(personMock.getLastName());
  }

  @Test
  void getAge() {
    assertEquals(personMock.getAge(), 0);
  }
}
