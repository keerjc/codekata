import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class PosNegZer
{
 public static void main(String[] args)
 {
  System.out.println("  *CHECK THE NO. FOR POSITIVE, NEGATIVE OR ZERO*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a no. :");
  int input_no=s.nextInt();
  if(input_no<0)
   System.out.println("The no. " + input_no + " is NEGATIVE");
  else if(input_no>0)
   System.out.println("The no. " + input_no + " is POSITIVE");
  else
   System.out.println("The no. " + input_no + " is ZERO");
 }
}
