package Task_29;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = obj.nextLine().charAt(0);

        System.out.println(ch);

        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            System.out.println("The character is a Vowel");
        } else {
            System.out.println("The character is a Consonant");
        }
    }
}
