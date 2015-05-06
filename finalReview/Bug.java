package finalReview;

import java.io.*;

public class Bug
{
  private char dir = 'r';
  private int position;
  
  public Bug(int p)
  {
    this.position = p;
  }
  
  public int move()
  {
    if (this.dir == 'r') {
      this.position += 1;
    } else {
      this.position -= 1;
    }
    return this.position;
  }
  
  public void turn()
  {
    if (this.dir == 'r') {
      this.dir = 'l';
    } else {
      this.dir = 'r';
    }
  }
  
  public int getPosition()
  {
    return this.position;
  }
  
  public String toString()
  {
    String s = "";
    if (this.dir == 'r') {
      s = "-->: " + this.position;
    } else {
      s = "<--: " + this.position;
    }
    return s;
  }
  
  public static void main(String[] args)
  {
    Bug b = new Bug(10);
    
    System.out.println(b.toString());
    for (int i = 0; i < 10; i++)
    {
      b.move();
      System.out.println(b.toString());
    }
  }
}
