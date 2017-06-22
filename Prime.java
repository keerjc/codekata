import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime
{
 public static void main(String[] args)
 {
  int start=0;
  System.out.println("  *PRIME NOS IN A RANGE*");
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter an start no.");
  int input1=s.nextInt();
  System.out.println("\nEnter an end no.");
  int input2=s.nextInt();
  if(input1==0||input1==1||input1==2)
   start=3;
  else
   start=input1;
  System.out.println("\nThe prime nos between "+input1+" and "+input2+" are ");
  for(int i=start; i <=input2; i++)
  {
   int flag=1;
   for(int j=2; j <i ; j++)
   {
    if(i % j == 0)
    {
     flag=0;
     break;
    }
   }
   if(flag==1)
    System.out.print(i + " ");
  }
  System.out.println();
 }
}
