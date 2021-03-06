package com.elsevier.education;

import java.util.Set;

/**

Immutabe class

*/
public class Exercise1 {

  public static final class Person {
    
    private Set<String> phoneNumbers;
    private String firstName;
    private String lastName;
    
    public Person(Set<String> phoneNumbers, String firstName, String lastName) {
      this.phoneNumbers = phoneNumbers;
      this.firstName = firstName;
      this.lastName = lastName;     
    }

    public Set<String> getPhoneNumbers() {
      return phoneNumbers;
    }
    
    public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
      return lastName;
    }
  }
}
