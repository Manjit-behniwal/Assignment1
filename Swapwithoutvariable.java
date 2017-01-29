/*
 Write a Program to swap two numbers without third variable*/
package swapwithoutvariable;


public class Swapwithoutvariable {
       
        
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("Before swaping Number 'a' is " + a);
        System.out.println("Before swaping Numbers 'b' is " + b);
        a=a + b;
        b=a-b;
        a=a-b;;
        System.out.println("After swaping Numbers 'a' is  " + a);
        System.out.println("After swaping Numbers 'b' is  " + b); 
    
    }
    
}
