package Task_30;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
    Withdraw();
    }
    static void Withdraw(){
        int Acc_Balance= 10000;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the you want to withdraw ");
        int amount = obj.nextInt();

        if (amount==0){
            System.out.println("Amount should be greater than 0 ");
            System.out.println("Withdrawl Failed!!");
        }
        else if (amount%100 != 0){
                System.out.println("Amount should multiple of 100");
                System.out.println("Withdrawl Failed!!");
        }
        else if (amount <= Acc_Balance){
            int c = Acc_Balance-amount;
            System.out.println("Remaining Balance in the account "+ c);
        }
        else {
            System.out.println("Insufficient Funds");
        }

    }
}

