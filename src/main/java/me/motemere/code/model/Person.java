package me.motemere.code.model;

import java.util.Objects;

/**
 * Person with last name, first name and age.
 */
public class Person {

  private final String firstName;
  private final String lastName;
  private final int age;

  public Person(String personFirstName, String personLastName, int personAge) {
    this.firstName = personFirstName;
    this.lastName = personLastName;
    this.age = personAge;
  }

  /**
   * Getter for person's first name.
   *
   * @return String  person's first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Getter for person's last name.
   *
   * @return String  person's last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Getter for person's age.
   *
   * @return int  person's age
   */
  public int getAge() {
    return age;
  }

  /**
   * Person's toString().
   *
   * @return String  all person data
   */
  @Override
  public String toString() {
    return "Person{"
        + "firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", age="
        + age
        + '}';
  }

  /**
   * Equals for Person.
   *
   * @param o some object like Person
   * @return result boolean
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Person person = (Person) o;

    return age == person.age
        && firstName.equals(person.firstName)
        && lastName.equals(person.lastName);
  }

  /**
   * HashCode for Person.
   *
   * @return hashCode int
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age);
  }
}
