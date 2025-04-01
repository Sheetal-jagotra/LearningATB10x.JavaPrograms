package Constructors;

import java.util.Scanner;

public class Default {
    public static void main(String[] args) {
    Sum s = new Sum();
    s.Add();
    }
}

class Sum{
    int a=10;
    int b=20;
    int sum;

    Sum(){
        
    }
    void Add(){
        System.out.println(a+b);
    }

}