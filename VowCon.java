import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class VowCon
{
 public static void main(String[] args)
 {
  System.out.println("  *CHECK THE CHARACTER IF VOWEL OR CONSONANT*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a character ");
  char input=s.next().charAt(0);
  if(input>=65 && input<=90 || input>=97 && input<=122)
  {
   if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u' ||
      input=='A' || input=='E' || input=='I' || input=='O' || input=='U')
    System.out.println("The character " + input + " is a VOWEL");
   else
    System.out.println("The character " + input + " is CONSONANT");
  }
  else
   System.out.println("Wrong input! Please enter an alphabet.");
 }
}
