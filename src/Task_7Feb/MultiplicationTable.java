package Task_7Feb;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("-----------Multiplication Table-------------");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = obj.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n +" * "+i+" = "+n*i );

        }
    }
}
