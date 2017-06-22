import java.util.*;
import java.lang.*;
import java.io.*;
public class StrEvOd
{
 public static void main(String[] args)
 {
  int i=0;
  char tmp;
  System.out.println("  *SWAP ODD AND EVEN POSITIONS IN A STRING*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a string");
  String input=s.nextLine();
  int len=input.length();
  char[] str=new char[len];
  for(i=0;i<len;i++)
  {
   str[i]=input.charAt(i);
  }
  for(i=0;i<len;i=i+2)
  {
   tmp = str[i];
   str[i] = str[i+1];
   str[i+1] = tmp;
  }
   System.out.println("Output: ");
  for(i=0;i<len;i++)
  {
   System.out.println(str[i]);
  }
 }
}
