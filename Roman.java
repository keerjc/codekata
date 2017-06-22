import java.io.*;
import java.util.*;
public class Roman
{
 public static void main(String[] args)
 {
    String roman;
    System.out.println("     *ROMAN NUMBER TO DECIMAL*");
    System.out.println("\nEnter a Roman Number:");
    Scanner in=new Scanner(System.in);
    roman=in.nextLine();
    int decimal = 0;
    String romanNumeral = roman.toUpperCase();
    for(int x = 0;x<romanNumeral.length();x++)
    {
        char convertToDecimal = romanNumeral.charAt(x);
        if(!(convertToDecimal=='M'||convertToDecimal=='D'||convertToDecimal=='C'||
           convertToDecimal=='L'||convertToDecimal=='X'||convertToDecimal=='V'||
           convertToDecimal=='I'))
        {
         decimal=0;
         break;
        }
        else{
        switch (convertToDecimal)
        {
        case 'M':
            decimal += 1000;
            break;

        case 'D':
            decimal += 500;
            break;

        case 'C':
            decimal += 100;
            break;

        case 'L':
            decimal += 50;
            break;

        case 'X':
            decimal += 10;
            break;

        case 'V':
            decimal += 5;
            break;

        case 'I':
            decimal += 1;
            break;
        }
     }
    }
    if(decimal!=0)
    {
    if (romanNumeral.contains("IV"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("IX"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("XL"))
    {
        decimal-=10;
    }
    if (romanNumeral.contains("XC"))
    {
        decimal-=10;
    }
    if (romanNumeral.contains("CD"))
    {
        decimal-=100;
    }
    if (romanNumeral.contains("CM"))
    {
        decimal-=100;
    }
   }
    if(decimal==0)
     System.out.println("\nThe given input is not a valid Roman Number");
    else
     System.out.println("\nThe decimal value is " +decimal);
  }
}
