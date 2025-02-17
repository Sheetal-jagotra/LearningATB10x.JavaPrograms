package Task_31;

import javax.xml.validation.Validator;
import java.util.Objects;
import java.util.Scanner;

public class Visa {
    public static void main(String[] args) {
        int min_age = 18;
        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);

        System.out.println("Enter the age of the person");
        int age = obj.nextInt();
        System.out.println("Enter the Visa status of the Person- Valid or Invalid");
        String status = obj2.nextLine();
                if ((age >= min_age)&&(Objects.equals(status, "Valid"))) {
                    System.out.println("Person is Eligible for travelling");
                }
                else {
                    System.out.println("Person not Eligible for travelling");
                }
    }
}
