package r8;

import java.io.*;

public class StringMethods
{
  public static void main(String[] args)
  {
    char endChar = lastChar("Chugger");
    System.out.println(endChar);
    
    String testReverse = reverseIt("snow");
    System.out.println(testReverse);
    
    int vowelTest = firstVowel("rhonda");
    System.out.println(vowelTest);
    
    String pigTest = pigLatin("trash");
    System.out.println(pigTest);
  }
  
  public static char lastChar(String word)
  {
    int len = word.length();
    char last = word.charAt(len - 1);
    return last;
  }
  
  public static String reverseIt(String input)
  {
    String reverseOutput = "";
    int len = input.length();
    for (int i = input.length() - 1; i >= 0; i--)
    {
      char c = input.charAt(i);
      reverseOutput = reverseOutput + c;
    }
    return reverseOutput;
  }
  
  public static int firstVowel(String word)
  {
    for (int i = 0; i <= word.length() - 1; i++) {
      if ((word.charAt(i) == 'a') || 
        (word.charAt(i) == 'i') || 
        (word.charAt(i) == 'u') || 
        (word.charAt(i) == 'e') || 
        (word.charAt(i) == 'o')) {
        return i;
      }
    }
    return 1;
  }
  
  public static String pigLatin(String word)
  {
    int pointer = firstVowel(word);
    return word.substring(pointer) + word.substring(0, pointer) + "ay";
  }
}
