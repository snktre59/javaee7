package org.kearis.formation.javaee7.chapitre3.ex15;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer15 {

  // ======================================
  // =             Attributes             =
  // ======================================
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Customer15() {
  }

  public Customer15(Long id, String firstName, String lastName, String email, String phoneNumber) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}