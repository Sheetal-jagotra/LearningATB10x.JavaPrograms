package Task_31;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String");
        String ch = obj.nextLine();
        StringBuilder a = new StringBuilder(ch);
        a.reverse();
        System.out.println(a);

    if (ch.contentEquals(a)){
        System.out.println("It is Palindrome");
    }
    else{
        System.out.println("It is not Palindrome");
    }
    }
}

