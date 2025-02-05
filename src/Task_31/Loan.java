package Task_31;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age of the Person");
        int age = obj.nextInt();
            if((age>=18) && (age <=80)){
            System.out.println("Person can apply for Loan");
            }
            else {
            System.out.println("Person cannot apply for the Loan");
            }
        System.out.println("-----------------------------------");
        System.out.println("Enter the salary of the Person");
            float salary = obj.nextFloat();
            if(salary>=30000){
                System.out.println("Person is eligible for Loan");
            }
            else{
                System.out.println("Person is not eligible for the Loan");
            }
        System.out.println("-----------------------------------");
        System.out.println("Enter the credit Score of the Person");
            int credit_score = obj.nextInt();
            if(credit_score>=650 && credit_score< 850){
                System.out.println("Loan can be approved");
            }
            else{
                System.out.println("Sorry Loan cannot be approved");
            }
        System.out.println("-----------------------------------");

    }
}
