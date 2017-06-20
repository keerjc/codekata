import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class DigCount
{
 public static void main(String[] args)
 {
  System.out.println("  *DIGIT COUNT*");
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a value");
  int no=s.nextInt();
  int count=Integer.toString(no).length();
  System.out.println("The no. of digits is " + count);
 }
}
