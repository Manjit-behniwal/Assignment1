/*
 Write a program ro check the given number is prime or not
 */
package prime;
import java.util.Scanner;

public class Prime {

    
    public static void main(String[] args) {
        
      int i,m=0,flag=0;    
      Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	
	int n=scan.nextInt();
      m=n/2;    
      for(i=2;i<=m;i++){    
       if(n%i==0){    
       System.out.println("Number is not prime");    
       flag=1;    
       break;    
       }    
      }
    if(flag==0)    
  System.out.println("Number is prime");    
}  
} 
        
    
