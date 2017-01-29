/*
 Program to find whether the given number is odd or even */

package program2;
import java.util.Scanner;

public class Program2 {
   public static void main(String args[])
   {
      int a;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
 
      if ( a % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}



    
   
   