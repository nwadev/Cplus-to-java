import java.util.Scanner;

/*an application that computes and shows the flight 
 duration, range, and maximum height attained by a 
 ground-launched projectile
*/

public class ConvSec {

public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.println("Enter a time in seconds: ");

int n = input.nextInt();



if (n < 0) {
    System.out.println("Error! The seconds must be greater than zero.");
} else {
    int days = calculateDays(n);
    int hours = calculateHours(days, n);
    int minutes = calculateMinutes(hours, n);
    int seconds = calculateSeconds(minutes, n);

    System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
}
}

public static int calculateDays(int n) {
int days = n / (24 * 3600);
return n % (24 * 3600);
}

public static int calculateHours(int days, int n) {
int hours = days / 3600;
return n % 3600;
}

public static int calculateMinutes(int hours, int n) {
int minutes = hours / 60;
return n % 60;
}

public static int calculateSeconds(int minutes, int n) {
return n;
}
}




































    
