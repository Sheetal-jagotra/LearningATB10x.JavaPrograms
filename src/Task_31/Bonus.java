package Task_31;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the experience in years");
        float exp = obj.nextFloat();
        System.out.println("Enter the Salary per Month");
        float salary = obj.nextFloat();

            if(exp<1){
                System.out.println("No Bonus will be added");
            }
            else if(exp <=3){
                float bonus = (salary*((float) 5 /100));
                System.out.println("Bonus added to the salary will be"+ bonus);
            }
            else if(exp <=6){
                float bonus = salary*((float) 10 /100);
                System.out.println("Bonus added to the salary will be"+ bonus);
            }
            else{
                float bonus = salary*((float) 15 /100);
                System.out.println("Bonus added to the salary will be"+ bonus);
            }
    }
}
