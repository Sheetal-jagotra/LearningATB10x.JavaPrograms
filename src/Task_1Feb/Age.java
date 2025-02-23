package Task_1Feb;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age of the Person");
        int age = obj.nextInt();
            if(age<=12){
                System.out.println("Person is a child");
            }
            else if(age<=19){
            System.out.println("Person is a Teenager");
            }
            else if (age<=64){
            System.out.println("Person is an Adult");
            }
            else {
            System.out.println("Person is a Senior");
            }
    }
}
