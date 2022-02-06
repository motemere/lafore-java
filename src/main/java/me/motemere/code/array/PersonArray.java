package me.motemere.code.array;

import java.util.Arrays;
import me.motemere.code.model.Person;
import me.motemere.code.utils.IntLoopHandler;

/**
 * Array data structure for Person.
 */
public class PersonArray {

  private Person[] arr;
  private int len;

  public PersonArray(Person[] personArray) {
    this.arr = personArray;
    this.len = personArray.length;
  }

  /**
   * Find Person in array.
   *
   * @param anotherPerson Person
   * @return result boolean
   */
  public boolean findPerson(Person anotherPerson) {

    for (int i = 0; i < len; i++) {
      if (arr[i].hashCode() == anotherPerson.hashCode()) {
        return true;
      }
    }

    return false;
  }

  /**
   * Find Person by name in array.
   *
   * @param name String
   * @return result boolean
   */
  public boolean findPersonByLastName(String name) {

    for (int i : IntLoopHandler.range(0, len)) {
      return arr[i].getLastName().equals(name);
    }

    return false;
  }

  /**
   * Insert new person to array.
   *
   * @param person Person
   */
  public void insert(Person person) {

    var newArray = new Person[len + 1];
    System.arraycopy(arr, 0, newArray, 0, len);

    newArray[len] = person;
    arr = newArray;

    len++;
  }

  /**
   * Delete Person from array.
   *
   * @param name String
   * @return result boolean
   */
  public boolean deletePersonByLastName(String name) {

    var newArray = new Person[len - 1];

    if (newArray.length == 0) {
      arr = newArray;
      len = newArray.length;
      return true;
    }

    int targetIdx = 0;

    for (int i : IntLoopHandler.range(0, len)) {
      if (!arr[i].getLastName().equals(name)) {
        newArray[targetIdx] = arr[i];
        targetIdx++;
      }
    }

    arr = newArray;
    len--;

    return !findPersonByLastName(name);
  }

  /**
   * Display personArray contents.
   *
   * @return String contents
   */
  @Override
  public String toString() {
    return "PersonArray{"
        + "arr="
        + Arrays.toString(arr)
        + ", len="
        + len
        + '}';
  }
}
