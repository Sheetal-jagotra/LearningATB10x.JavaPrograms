package Task_29;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = obj.nextInt();

            if(age >= 18){
                System.out.println("the person is eligible for voting");
            }
            else {
                System.out.println("the person is not eligible for voting");
            }
    }
}
