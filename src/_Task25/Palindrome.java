package _Task25;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = obj.nextLine();
        System.out.println(name);
        boolean is_palindrome = false;
            for(int i = 0;i<=name.length()/2;i++) {
                char start = name.charAt(i);
                char end = name.charAt(name.length() - 1-i);
                if(start != end){
                  is_palindrome = false;
                 break;
              }
              else {
                  is_palindrome = true;

              }

            }
        if(is_palindrome){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not Palindrome");

        }
    }

}

