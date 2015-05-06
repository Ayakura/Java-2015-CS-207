package finalReview;

import java.io.*;

public class BankAccount
{
  private int accountNumber;
  private String SSN;
  private String name;
  private double balance;
  private static int lastAccountNumber;
  
  public BankAccount(String SSN, String name)
  {
    this.SSN = SSN;
    this.name = name;
    this.accountNumber = lastAccountNumber;
    
    lastAccountNumber += 1;
  }
  
  public BankAccount(String SSN, String name, double balance)
  {
    this.SSN = SSN;
    this.name = name;
    this.balance = balance;
    
    this.accountNumber = lastAccountNumber;
    
    lastAccountNumber += 1;
  }
  
  public String toString()
  {
    String s = "SSN: " + this.SSN + "\n" + 
      "Account Number: " + this.accountNumber + "\n" + 
      "Name: " + this.name + "\n" + 
      "Balance: " + this.balance;
    
    return s;
  }
  
  public int getAccountNumber()
  {
    return this.accountNumber;
  }
  
  public static int getLastAccountNumber()
  {
    return lastAccountNumber;
  }
  
  public static void main(String[] args)
  {
    BankAccount[] ba = new BankAccount[2];
    
    ba[0] = new BankAccount("1234", "John");
    ba[1] = new BankAccount("2345", "Scott", 200.0D);
    
    BankAccount[] a = ba;
    for (int i = 0; i < a.length; i++)
    {
      System.out.println(" ------ Account: " + i + " ------");
      System.out.println(a[i].toString());
    }
  }
}
