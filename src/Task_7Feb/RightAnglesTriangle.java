package Task_7Feb;

import java.util.Scanner;

public class RightAnglesTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
