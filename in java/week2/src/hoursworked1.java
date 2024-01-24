import java.util.Scanner;

public class hoursworked1 {

    //main function
    public static void main(String[] args){

    Scanner input =  new Scanner(System.in);
    System.out.println("How many hours did you work? ");
    int hours = input.nextInt();
    


    // Get the hourly pay rate.
    System.out.println("How much do you get paid per hour?");
    int pay = input.nextInt();


    // display the money made
    System.out.println("You have earned: $"+ paycal(pay,hours) + " dollars");

    }

    //second function

    public static int paycal(int pay , int hours){

        return pay * hours ;




    }


}
