package Constructors;

public class Overloading {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.Multiply();
        c.Subtract();

    }
}

class Calculation{
    int a=50;
    int b=10;
    Calculation(){

    }

    Calculation(int a, int b){
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

