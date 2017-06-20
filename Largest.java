import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Largest
{
 public static void main(String[] args)
 {
  System.out.println("  *FIND THE LARGEST NO. AMONG 3*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter no. 1");
  int no1=s.nextInt();
  System.out.println("\nEnter no. 2");
  int no2=s.nextInt();
  System.out.println("\nEnter no. 3");
  int no3=s.nextInt();
  int large=no1;
  if(no2 > large)
   large=no2;
  else if(no3 > large)
   large=no3;
  System.out.println("\nThe largest no. among " + no1 + ", " + no2 + ", " + no3 + " is " + large);
 }
}
