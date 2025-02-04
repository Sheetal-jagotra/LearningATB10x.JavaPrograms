package Task_30;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 1 side of the triangle");
        int a = obj.nextInt();
        System.out.println("Enter the 2 side of the triangle");
        int b = obj.nextInt();
        System.out.println("Enter the 3 side of the triangle");
        int c = obj.nextInt();

    if((a==b)&&(b==c)){
        System.out.println("The triangle is Equilateral");
    }
    else if ((a==b)||(b==c)||a==c) {
        System.out.println("The triangle is Isosceles");
    }
    else{
        System.out.println("The triangle is Scalene");
    }
    }
}
