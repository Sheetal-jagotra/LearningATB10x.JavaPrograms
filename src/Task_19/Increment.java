package Task_19;

public class Increment {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        int b = 10;
        System.out.println(++b + b++ + b++);
        System.out.println(b);
    }

}

