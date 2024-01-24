import java.util.Scanner;

//an application that computes and shows the flight duration, range, 
//and maximum height of a projectile thrown from the ground based on user inputs


public class projFlight {

public static void main(String []args){


Scanner input = new Scanner(System.in);

System.out.println("What was the angle of launch in degrees? " );    

double userDegree = input.nextDouble();


System.out.println("What was the velocity of launch in feet/sec? ");

double userVelocity = input.nextDouble();


double gravity = 32.17405;

double Pi = Math.acos(-1);


TotalTime(userDegree ,userVelocity ,Pi ,gravity );


}



public static double TotalTime(double userDegree, double userVelocity ,  double Pi , double gravity){
    double userVelocityRadians = (Pi/180) * (userDegree);
    double Vv = userVelocity * Math.sin(userVelocityRadians);
    double TotalTime = (2.0 * Vv ) / gravity;
    return Range(Vv, TotalTime, gravity , userVelocityRadians , userVelocity);

}

public static double Range(double Vv, double TotalTime,double gravity ,double userVelocityRadians , double userVelocity){
    double Vh = userVelocity * Math.cos(userVelocityRadians);
    double Range = (2.0 * Vh *  Vv ) /  gravity ;
    return hmax(Vv,TotalTime,Range,gravity);
}

public static double hmax(double Vv, double TotalTime , double Range, double gravity){
double maxH = (Math.pow(Vv,2) / (2.0 * gravity));
return Inline(maxH,TotalTime,Range);
}

public static double Inline(double maxH , double TotalTime, double Range){
    System.out.printf("The calculated flight time is: %.5f seconds.\n", TotalTime);
    System.out.printf("The calculated distance traveled is: %.5f feet.\n", Range);
    System.out.printf("The maximum height achieved should be: %.5f feet.\n", maxH);
    

    return Range;
}





}


