package org.kearis.formation.javaee7.chapitre1_2.ex21;

import javax.validation.constraints.*;

public class CD21 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String title;
  private Float price;
  private String description;
  private String musicCompany;
  private Integer numberOfCDs;
  private Float totalDuration;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CD21() {
  }

  public CD21(String title, Float price) {
    this.title = title;
    this.price = price;
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public Float calculatePrice(@DecimalMin("1.4") Float rate) {
    return price * rate;
  }

  public Float calculateVAT() {
    return price * 0.196f;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMusicCompany() {
    return musicCompany;
  }

  public void setMusicCompany(String musicCompany) {
    this.musicCompany = musicCompany;
  }

  public Integer getNumberOfCDs() {
    return numberOfCDs;
  }

  public void setNumberOfCDs(Integer numberOfCDs) {
    this.numberOfCDs = numberOfCDs;
  }

  public Float getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Float totalDuration) {
    this.totalDuration = totalDuration;
  }

  // ======================================
  // =         hash, equals, toString     =
  // ======================================

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("CD");
    sb.append(", title='").append(title).append('\'');
    sb.append(", price=").append(price);
    sb.append(", description='").append(description).append('\'');
    sb.append(", musicCompany='").append(musicCompany).append('\'');
    sb.append(", numberOfCDs=").append(numberOfCDs);
    sb.append(", totalDuration=").append(totalDuration);
    sb.append('}');
    return sb.toString();
  }
}