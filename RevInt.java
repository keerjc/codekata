import java.util.*;
import java.lang.*;
import java.io.*;
public class RevInt
{
 public static void main(String[] args)
 {
  int last_digit, reversedNum=0;
  System.out.println("  *INT DIGIT REVERSE*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter an integer");
  int input=s.nextInt();
  while (input != 0)
  {
   last_digit = input % 10;
   reversedNum = reversedNum * 10 + last_digit;
   input = input / 10;
  }
  System.out.println("\nThe reversed digits of an integer is "+reversedNum);
 }
}
