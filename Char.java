import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Char
{
 public static void main(String[] args)
 {
  System.out.println("  *CHECK THE CHARACTER IF ALPHABET OR NOT*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a character");
  char input=s.next().charAt(0);
  if(input>=65 && input<=90 || input>=97 && input<=122)
   System.out.println("The character " + input + " is an ALPHABET");
  else
   System.out.println("The character " + input + " is not an ALPHABET");
 }
}
