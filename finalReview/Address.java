package finalReview;

import java.io.*;

public class Address
{
  private String houseNum;
  private String aptNum;
  private String street;
  private String city;
  private String state;
  private String zipCode;
  boolean hasAptNumber = false;
  
  public Address(String houseNum, String street, String state, String zipCode, String city)
  {
    this.houseNum = houseNum;
    this.street = street;
    this.city = city;
    this.state = state;
    
    this.hasAptNumber = false;
  }
  
  public Address(String houseNum, String street, String state, String zipCode, String city, String aptNum)
  {
    this.aptNum = aptNum;
    this.houseNum = houseNum;
    this.street = street;
    this.city = city;
    this.state = state;
    
    this.hasAptNumber = true;
  }
  
  public String printAddress()
  {
    String s = "Street: " + this.street + "\n" + 
      "City: " + this.city + "," + "State: " + this.state + "," + "Zip Code: " + this.zipCode;
    return s;
  }
  
  public String print()
  {
    String addr = this.houseNum + " " + this.street + "\n";
    if (this.hasAptNumber) {
      addr = addr + "Apt." + this.aptNum + "\n";
    }
    addr = addr + this.city + "," + this.state + " " + this.zipCode;
    return addr;
  }
  
  public static void main(String[] args)
  {
    Address a = new Address("123", 
      "Oak Dr.", 
      "Ames", 
      "Iowa", 
      "50010");
    
    System.out.println(a.toString());
    
    System.out.println("=====================");
    
    Address b = new Address("987", 
      "101", 
      "Oak Dr.", 
      "Ames", 
      "Iowa", 
      "50010");
    
    System.out.println(b.toString());
  }
}
