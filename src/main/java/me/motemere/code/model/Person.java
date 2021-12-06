package me.motemere.code.model;

import lombok.Data;

/**
 * Person with last name, first name and age.
 */
@Data
public class Person {
  private final String firstName;
  private final String lastName;
  private final int age;
}
