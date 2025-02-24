package Task_7Feb;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = obj.nextInt();
        int count = 0;
        if(num==0 || num ==1)
            System.out.println("the number is not prime");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count = count +1 ;
            }
        }
            if (count == 1) {
                System.out.println("the number is prime");
            } else {
                System.out.println("The number is not prime");
            }

    }

}

