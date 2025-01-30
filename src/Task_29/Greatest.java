package Task_29;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

            if(num1 > num2){
                System.out.println(num1 + " is greater");
            }
            else {
                System.out.println(num2 + " is greater");
            }
    }
}
