package Task_30;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int flag = 0;
        if (a == 0 || a == 1) {
            System.out.println("Number is not Prime");
        } else {
            for (int i = 2; i <= a/2; i++) {
                if (a % i != 0){
                    flag = 1;
                    System.out.println("Number is not prime");
                }
                if (flag == 0) {
                    System.out.println("Number is prime");
                    break;
                }
            }

        }
    }
}