import java.util.*;
import java.lang.*;
import java.io.*;
public class Camel
{
 public static void main(String[] args)
 {
  System.out.println("    *CAMEL CASE*");
  Scanner scanner = new Scanner(System.in);
  System.out.println("\nEnter a sentence");
  String input = scanner.nextLine();
  String result = "";
  char firstChar = input.charAt(0);
  result = result + Character.toUpperCase(firstChar);
  for (int i = 1; i < input.length(); i++)
  {
   char currentChar = input.charAt(i);
   char previousChar = input.charAt(i - 1);
   if(previousChar == ' ')
   {
    result = result + Character.toUpperCase(currentChar);
   }
   else
   {
    result = result + currentChar;
   }
  }
  System.out.println("\nCamel Case for '"+input+ "' is '"+result+"'");
 }
}
