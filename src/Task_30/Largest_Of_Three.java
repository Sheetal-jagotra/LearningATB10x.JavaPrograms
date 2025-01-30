package Task_30;
import java.util.Scanner;
public class Largest_Of_Three {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
            if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is Largest");
            }
            else if(num2 > num1 && num2 > num3){
                System.out.println( num2 + "is Largest");
            }
            else{
                System.out.println(num3 +" is Largest");
            }
    }
}
