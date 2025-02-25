package Task_7Feb;

import java.util.Scanner;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        for (int i =num; i >= 0; i--) {
            for(int j=i;j>= 0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
