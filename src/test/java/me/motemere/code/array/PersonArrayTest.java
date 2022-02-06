package me.motemere.code.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import me.motemere.code.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("MagicNumber")
class PersonArrayTest {

  private PersonArray arr;

  @BeforeEach
  void setUp() {
    arr = new PersonArray(new Person[]{});
    arr.insert(new Person("Evans", "Patty", 24));
    arr.insert(new Person("Smith", "Lorraine", 37));
    arr.insert(new Person("Yee", "Tom", 43));
    arr.insert(new Person("Adams", "Henry", 63));
    arr.insert(new Person("Velasquez", "Jose", 72));
  }

  @Test
  void findPerson() {
    var person = new Person("Velasquez", "Jose", 72);
    assertTrue(arr.findPerson(person));
  }

  @Test
  void findPersonByLastName() {
    assertTrue(arr.findPersonByLastName("Patty"));
  }

  @Test
  void insert() {
    var person = new Person("Lamarque", "Henry", 54);
    arr.insert(person);
    assertTrue(arr.findPerson(person));
  }

  @Test
  void deletePersonByLastName() {
    arr.deletePersonByLastName("Patty");
    assertFalse(arr.findPersonByLastName("Patty"));
  }
}
