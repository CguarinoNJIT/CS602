//*************************************************************
// Write a program that reads two floating point numbers and
// prints their sum, difference and product.
//**************************************************************
import java.util.Scanner;

public class FloatCalculations{
    public static void main(String[] args){
        double num1, num2; 
        Scanner scan = new Scanner(System.in); 

        System.out.println("Enter first number: "); 
        num1 = scan.nextDouble(); 
        System.out.println("Enter second number: "); 
        num2 = scan.nextDouble(); 

        System.out.println("The sum of "+num1+" and "+num2+" is: "+ (num1+num2));
        System.out.println("The difference of "+num1+" and "+num2+" is: "+ (num1-num2)); 
        System.out.println("The product of "+num1+" and "+num2+" is: "+ (num1*num2));
    }
}