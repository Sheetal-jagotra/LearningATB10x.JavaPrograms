package Task_31;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of units consumed");
        int unit = obj.nextInt();
        int units_100 = 100;
        int units_200 = 200;
        int units_300 = 300;
        double unit_100_multiplier = 0.50;
        double unit_200_multiplier = 0.75;
        double unit_300_multiplier = 1.20;
        if (unit <= units_100) {
            double first_100_units = (unit * unit_100_multiplier);
            System.out.println("Total amount = " + first_100_units);
        }
        else if (unit <= units_200) {
            double total2 = 0;
            double first_100_units_price = (units_100*unit_100_multiplier) ;
            double first_200_unit_price = (unit - units_100) * unit_200_multiplier;
            total2 = ((first_100_units_price)+ first_200_unit_price);
            System.out.println("Total amount = " + total2);
        } else if (unit <= units_300) {
           double total3 = ((units_100*unit_100_multiplier) + (units_100*unit_200_multiplier) + (unit - units_200) * unit_300_multiplier);
            System.out.println("Total amount = " + total3);
        } else {
            double total4 = ((units_100*unit_100_multiplier) + (units_100*unit_200_multiplier) + (units_100*unit_300_multiplier) + (unit - units_300) * 1.50);
            System.out.println("Total amount = " + total4);
        }
    }
}
