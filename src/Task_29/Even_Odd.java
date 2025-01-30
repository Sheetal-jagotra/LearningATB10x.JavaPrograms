package Task_29;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        System.out.println(num);
            if(num%2==0){
                System.out.println("The number is Even");
            }
            else{
                System.out.println("The number is Odd");
            }
    }
}
