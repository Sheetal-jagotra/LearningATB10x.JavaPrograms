package T_ask_25;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Name");
        String name = obj.nextLine();
        System.out.println(name);

        int vCount = 0;
        int cCount = 0;
        for(int i =0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch =='a'|| ch == 'e'|| ch =='i'|| ch == 'o'||ch =='u'||ch =='A'|| ch == 'E'|| ch =='I'|| ch == 'O'||ch =='U'){
                vCount++;
            }
            else if (ch>='a'&& ch<+'z'){
                cCount++;
            }
        }
        System.out.println("Number of Vowels = "+ vCount);
        System.out.println("Number of Consonants = "+ cCount);
    }
}

