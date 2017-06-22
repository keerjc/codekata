import java.util.*;
import java.lang.*;
import java.io.*;
public class Fact
{
 public static void main(String[] args)
 {
  int ans=1;
  System.out.println("  *FACTORIAL*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter a no. to find its factorial");
  int no=s.nextInt();
  for(int i=1;i<=no;i++)
   ans=ans*i;
  System.out.println("\nThe factorial of "+no+" is "+ans);
 }
}
