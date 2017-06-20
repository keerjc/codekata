import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Leap
{
 public static void main(String[] args)
 {
  System.out.println("  *FIND IF THE YEAR IS LEAP OR NOT*");
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the year");
  int year=s.nextInt();
  if(year%4==0)
  {
   if(year%100==0)
   {
    if(year%400==0)
     System.out.println("The year " + year + " is a LEAP YEAR");
    else
     System.out.println("The year " + year + " is NOT a LEAP YEAR");
   }
   else
    System.out.println("The year " + year + " is a LEAP YEAR");
  }
  else
   System.out.println("The year " + year + " is NOT a LEAP YEAR");
 }
}
