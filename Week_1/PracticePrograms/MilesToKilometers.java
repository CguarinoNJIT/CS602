//*************************************************************
// Write a program that converts miles to kilometers (1mile =
// 1.60935 kilometers). Read the miles value from the user as
// a floating point value.
// ********************************************************** 
import java.util.Scanner;

public class MilesToKilometers{ 
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); 
        double miles, kilometers; 
        final double kilo_constant = 1.60935; 

        System.out.println("Enter miles: "); 
        miles = scan.nextDouble(); 
        kilometers = miles * kilo_constant;

        System.out.println(miles +" miles translate to "+ kilometers +" kilometers." ); 

    }
}