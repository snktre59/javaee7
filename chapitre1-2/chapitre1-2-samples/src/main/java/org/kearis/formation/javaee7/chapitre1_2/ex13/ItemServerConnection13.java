package org.kearis.formation.javaee7.chapitre1_2.ex13;

import javax.validation.constraints.NotNull;

public class ItemServerConnection13 {

  // ======================================
  // =             Attributes             =
  // ======================================

//  @URL
  private String resourceURL;
//  @NotNull
//  @URL(protocol = "http", host = "www.cdbookstore.com")
  private String itemURL;
//  @URL(protocol = "ftp", port = 21)
  private String ftpServerURL;

  // ======================================
  // =            Constructors            =
  // ======================================

  public ItemServerConnection13() {
  }

  public ItemServerConnection13(String resourceURL, String itemURL, String ftpServerURL) {
    this.resourceURL = resourceURL;
    this.itemURL = itemURL;
    this.ftpServerURL = ftpServerURL;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getResourceURL() {
    return resourceURL;
  }

  public void setResourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
  }

  public String getItemURL() {
    return itemURL;
  }

  public void setItemURL(String itemURL) {
    this.itemURL = itemURL;
  }

  public String getFtpServerURL() {
    return ftpServerURL;
  }

  public void setFtpServerURL(String ftpServerURL) {
    this.ftpServerURL = ftpServerURL;
  }
}
