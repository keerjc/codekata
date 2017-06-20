import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class EvenOdd
{
 public static void main(String[] args)
 {
  System.out.println("  *CHECK THE NO. IF EVEN OR ODD*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a no. :");
  int input_no=s.nextInt();
  if(input_no%2==0)
   System.out.println("The no. " + input_no + " is EVEN");
  else
   System.out.println("The no. " + input_no + " is ODD");
 }
}
