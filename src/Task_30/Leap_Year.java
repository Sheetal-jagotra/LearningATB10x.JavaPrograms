package Task_30;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = obj.nextInt();

            if(year%4==0){
                System.out.println("The year is leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
    }
}
