import java.util.*;
import java.lang.*;
import java.io.*;
public class StrInt
{
 public static void main(String[] args)
 {
  System.out.println("  *STRING TO INT*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a string");
  String input=s.nextLine();
  int convert=Integer.parseInt(input);
  System.out.println("\nThe string "+input+ " is converted to "+convert);
  System.out.println("\nThe converted value "+convert+ " on division by 2 gives "+(convert/2));
  System.out.println("\nHence the value "+input+" is converted from string to int");
 }
}
