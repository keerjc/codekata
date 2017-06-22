import java.util.*;
import java.lang.*;
import java.io.*;
public class RevStr
{
 public static void main(String[] args)
 {
  System.out.println("  *STRING REVERSE*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a string");
  String input=s.nextLine();
  StringBuilder input1 = new StringBuilder();
  input1.append(input);
  input1 = input1.reverse();
  System.out.println("\nThe reversed string is ");
  for (int i=0; i<input1.length(); i++)
   System.out.print(input1.charAt(i));
  System.out.println("");
 }
}
