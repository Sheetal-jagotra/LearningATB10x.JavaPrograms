package Task_30;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
            if(a<b){
                System.out.println(a+ " is Smallest");
            }
            else {
                System.out.println(b+ " is Smallest");
            }

    }
}
