package Task_30;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = obj.nextLine().charAt(0);

            if((ch >= 'a')&&(ch<='z')){
                System.out.println("Character is an alphabet");
            }
            else{
                System.out.println("Character is not an alphabet");
            }

    }
}
