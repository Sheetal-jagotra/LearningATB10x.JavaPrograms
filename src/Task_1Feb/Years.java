package Task_1Feb;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
       Calculate();
    }
       static void Calculate() {
            int number_of_days_in_year = 365;
           int number_of_days_in_month = 30;

           Scanner obj = new Scanner(System.in);
           System.out.println("Enter number of days");
           int num = obj.nextInt();
           int year = num / number_of_days_in_year;
           System.out.println("years = " + year);

            int months = ((num-(number_of_days_in_year*year))/number_of_days_in_month);
            System.out.println("months = "+ months);

            int days = ((num-(number_of_days_in_year*year))%number_of_days_in_month);
           System.out.println("Days = "+ days);
           System.out.println("----------------------------------");
           System.out.println(year + " years ,"+ months + " months ," + days + " days ");
    }

}
