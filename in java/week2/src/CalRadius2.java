/*Create a software that computes and displays a radius after receiving input from the user:
1. area of said circle
2. A circle's circumference with the specified radius


3. A sphere's surface area with the specified radius
4. The sphere's volume at the specified radius.
Direct programming in Zylabs is possible. The type of all variables should be double. The value of should be 3.141592.*/

import java.util.Scanner;
import java.lang.Math;

public class CalRadius2 {


//first function

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("enter a valid radius: ");
double r = input.nextInt();




System.out.println("The circle's area: "+ Area(r));
System.out.println("The circle's circumference: "+ Circumference(r));
System.out.println("The sphere's surface area: " + SurfaceArea(r));
System.out.println("The sphere's volume: " + Volume(r));


}

// second variable
public static double Area(double r){
    return  (3.141592 * Math.pow(r,2));
}



public static double Circumference(double r){
    return  (2 * r * 3.141592) ;
}


public static double SurfaceArea(double r){
    return   (4 * 3.141592 * Math.pow(r,2));
}

public static double Volume(double r){
    return  ((4.0 / 3.0 ) * 3.141592 * Math.pow(r,3)) ;
}

    
}
