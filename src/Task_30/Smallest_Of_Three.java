package Task_30;
import java.util.Scanner;
public class Smallest_Of_Three {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

            if((a<b)&&(a<c)){
                System.out.println(a+ "is Smallest");
            }
            else if((b<a)&&(b<c)){
                System.out.println(a+ "is Smallest");
            }
            else{
                System.out.println(c+ " is Smallest");
            }
    }
}
