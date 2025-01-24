package Operators;

public class Grades {
    public static void main(String[] args) {
        int a = 10;
        int b = 60;
        int c = 40;
    String grade = (a >= b) ? ((a>=c)? "a":"c") : ((b>=c)?"b":"c");
        System.out.println(grade);
    }
}
