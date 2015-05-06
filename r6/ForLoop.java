package r6;

import java.io.PrintStream;
import java.util.Scanner;

public class ForLoop
{
  public static void main(String[] args)
  {
    System.out.println("Enter a number: ");
    Scanner stdin = new Scanner(System.in);
    int input = stdin.nextInt();
    
    int result = 1;
    for (int i = 1; i < input; i++) {
      result *= i;
    }
    System.out.print(result);
  }
}
