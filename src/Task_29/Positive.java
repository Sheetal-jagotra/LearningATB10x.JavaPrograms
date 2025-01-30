package Task_29;
import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        System.out.println(num);
            if(num < 0){
                System.out.println("The number is Negative");
            }
            else{
            System.out.println("The number is Positive");
        }
    }
}
