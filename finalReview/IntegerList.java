package finalReview;

import java.io.*;

public class IntegerList
{
  private int[] data;
  private int counter = 0;
  
  public IntegerList(int i)
  {
    this.data = new int[i];
  }
  
  public IntegerList()
  {
    this.data = new int[10];
  }
  
  public String toString()
  {
    String s = "array size: " + this.counter;
    for (int i = 0; i < this.counter; i++) {
      s = s + "\n" + i + ": " + this.data[i];
    }
    return s;
  }
  
  public int add(int d)
  {
    expand();
    
    this.data[this.counter] = d;
    this.counter += 1;
    
    return this.counter;
  }
  
  public int get(int i)
  {
    if ((i >= 0) && (i < this.counter)) {
      return this.data[i];
    }
    return -1;
  }
  
  public int getSize()
  {
    return this.counter;
  }
  
  public int indexOf(int i)
  {
    int curIndex = 0;
    while (curIndex < this.counter)
    {
      if (this.data[curIndex] == i) {
        return curIndex;
      }
      curIndex++;
    }
    return -1;
  }
  
  public boolean delete(int i)
  {
    int curPos = indexOf(i);
    if (indexOf(i) == -1) {
      return false;
    }
    this.data[curPos] = this.data[(this.counter - 1)];
    
    this.counter -= 1;
    return true;
  }
  
  private void expand()
  {
    if (this.counter == this.data.length)
    {
      int[] newData = new int[this.data.length * 2];
      for (int i = 0; i < this.data.length; i++) {
        newData[i] = this.data[i];
      }
      this.data = newData;
    }
  }
  
  public int add(int d, int pos)
  {
    if ((pos >= this.counter) || (pos < 0)) {
      return -1;
    }
    expand();
    for (int i = this.counter; i != pos; i--) {
      this.data[i] = this.data[(i - 1)];
    }
    this.data[pos] = d;
    this.counter += 1;
    
    return this.counter;
  }
  
  public int add(int[] d)
  {
    int[] newData = new int[this.counter + d.length];
    for (int i = 0; i < this.counter; i++) {
      newData[i] = this.data[i];
    }
    for (int i = 0; i < d.length; i++) {
      newData[(i + this.counter)] = d[i];
    }
    this.data = newData;
    this.counter += d.length;
    
    return this.counter;
  }
  
  int getTotalNumberOfKey()
  {
    int[] tmp = new int[this.data.length];
    int lastIndex = 0;
    for (int i = 0; i < this.counter; i++)
    {
      boolean found = false;
      for (int j = 0; j < lastIndex; j++) {
        if (this.data[i] == tmp[j]) {
          found = true;
        }
      }
      if ((found = false) && counter != 0) {
        tmp[lastIndex] = this.data[i];
      }
    }
    return lastIndex;
  }
  
  boolean containsAll(int[] paramArrayOfInt)
  {
    throw new Error("Unresolved compilation problem: \n\tThis method must return a result of type boolean\n");
  }
  
  public static void main(String[] args)
  {
    IntegerList myList = new IntegerList();
    for (int i = 0; i < 10; i++) {
      myList.add(i + 100);
    }
    System.out.println(myList.toString());
    
    myList.add(999, 2);
    
    System.out.println(myList.toString());
  }
}
