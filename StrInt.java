import java.util.*;
import java.lang.*;
import java.io.*;
public class StrInt
{
 public static void main(String[] args)
 {
  int k=0;
  System.out.println("  *STRING TO INT*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a no. (stored as string)");
  String input=s.nextLine();
  int length=input.length();
  for(int i=0;i<length;i++)
  {
   char char1=input.charAt(i);
   if(!(char1>=48&&char1<=57))
   {
    k=1;
   }
  }
  if(k==1)
  {
   System.out.println("The given input is not a number");
  }
  else
  {
   int convert=Integer.parseInt(input);
   System.out.println("\nThe string "+input+ " is converted to type integer "+convert);
   System.out.println("\nThe converted value "+convert+ " on division by 2 gives "+(convert/2));
   System.out.println("\nHence the value "+input+" is converted from string to int");
  }
 }
}
