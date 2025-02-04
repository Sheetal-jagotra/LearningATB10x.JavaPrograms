package Task_30;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = obj.nextLine().charAt(0);

            if(Character.isLetter(ch)){
                System.out.println("Character is an alphabet");
            }
            else{
                System.out.println("Character is not an alphabet");
            }

    }
}
