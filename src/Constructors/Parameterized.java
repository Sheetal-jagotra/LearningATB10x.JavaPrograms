package Constructors;

public class Parameterized {
    public static void main(String[] args) {
        Calculate c = new Calculate(10,5);
        c.Multiply();
        c.Subtract();

    }
}

class Calculate{
    int a;
    int b;
        Calculate(int a, int b){
            this.a= a;
            this.b= b;
        }
        void Multiply(){
            System.out.println(a*b);
        }
        void Subtract(){
            System.out.println(a-b);
        }
}