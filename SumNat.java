import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class SumNat
{
 public static void main(String[] args)
 {
  System.out.println("  *SUM OF NATURAL NOS*");
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=s.nextInt();
  int result=n*(n+1)/2;
  System.out.println("The sum of n values is " + result);
 }
}
