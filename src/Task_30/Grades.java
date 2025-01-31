package Task_30;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        float marks = obj.nextFloat();

            if((49 >= marks)&& (marks >=40)){
                System.out.println("Grade = E");
            } else if((marks <=59) &&(marks >=50)) {
                System.out.println("Grade = D");
            }
            else if((marks <=69) &&(marks >=60)) {
                System.out.println("Grade = C");
            }
            else if((marks <=79) &&(marks >=70)) {
                System.out.println("Grade = B");
            }
            else if((marks <=89) &&(marks >=80)){
                System.out.println("Grade = A");
            }
            else if((marks >=90) &&(marks <=100)) {
                System.out.println("Grade = A+");
            }
            else {
                System.out.println("Fail");
            }

    }
}
