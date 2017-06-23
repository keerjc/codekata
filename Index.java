import java.util.*;
import java.lang.*;
import java.io.*;
public class Index
{
 public static void ArrayIndex(int arr[],int n)
 {
		int i;
	for(i=0;i<n;i++)
	{
		if(arr[i]==i)
		{
			System.out.println("The index "+i+" has the value "+arr[i]);
		}
	}
   
  }
 public static void main(String[] args)
 {
	 int n,i;
	 System.out.println("   *ARRAY VALUE EQUALS INDEX*");
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the size n of array");
	 n=s.nextInt();
	 try
	 {
	  System.out.println("Enter the array elements");
	  int[] arr=new int[n];
	  for(i=0;i<n;i++)
	  {
		 arr[i]=s.nextInt();
   	  }
	  ArrayIndex(arr,n);
	 }
	 catch(InputMismatchException e){
		   System.out.println("Input should be Integer");
	   }
 }
}
