package Maximum;

public class Greatest {
    public static void main(String[] args) {
        String n1 = args[0];
        String n2 = args[1];
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        String greatest = a>b ? "A is greater": "B is greater";
        System.out.println(greatest);
    }
}
