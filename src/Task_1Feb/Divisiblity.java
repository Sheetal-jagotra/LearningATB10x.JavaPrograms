package Task_1Feb;

import java.util.Scanner;

public class Divisiblity {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
            if(num%5==0){
            System.out.println("The number is divisible by 5");
             }
            else if(num%11==0){
            System.out.println("The number is divisible 11");
            }
            else{
                System.out.println("The number is not divisible by 5 and 11");
            }
    }
}
