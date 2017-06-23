import java.util.*;
public class MinArr 
{
 public static void main(String[] args)
 {
	int n,i,j;
	 System.out.println("   *MINIMUM SUM OF 2 ELEMENTS IN AN ARRAY*");
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
      int min=arr[0]+arr[1];
      int n1=0,n2=1,sum;
      for(i=0;i<n-1;i++)
      {
       for(j=i+1;j<n;j++){
    	   sum=arr[i]+arr[j];
    	   if(Math.abs(min)>Math.abs(sum)){
    		   min=sum;
    		   n1=i;
    		   n2=j;
    	   }
       }
      }
      System.out.println("The 2 elements whose sum "+min+" is close to zero is "+arr[n1]+" and "+arr[n2
      }
	 catch(InputMismatchException e)
	 {
		 System.out.println("Input should be Integer"); 
	 }
 }
}
