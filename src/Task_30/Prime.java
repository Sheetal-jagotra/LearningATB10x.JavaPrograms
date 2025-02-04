package Task_30;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int count= 0;
        if (a == 0 || a == 1) {
            System.out.println("Number is not Prime");
        }
        else {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    count = count + 1;
                }
            }
        }
        if(count==1){
            System.out.println("It is a  Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
    }
}