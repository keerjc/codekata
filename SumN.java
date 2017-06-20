import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class SumN
{
 public static void main(String[] args)
 {
  System.out.println("  *SUM OF NATURAL NOS USING FOR LOOP*");
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=s.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++)
  {
   sum=sum+i;
  }
  System.out.println("The sum of n values is " + sum);
 }
}
