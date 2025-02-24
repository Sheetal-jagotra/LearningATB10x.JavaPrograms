package Task_7Feb;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("-----------Factorial-----------");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = obj.nextInt();
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
