package Task21Feb;

public class Overloading {
    public static void main(String[] args) {
        AddSum addsum =new AddSum();
        addsum.add();
        addsum.add(5,7,8);
    }
}
class AddSum{
    int a=10;
    int b=15;
    int sum=(a+b);
    void add(){
        System.out.println("the addition of the number is "+ sum);
    }
    void add(int a,int b){
        System.out.println("the addition of these numbers are "+ (a+b));
    }
    void add(int a, int b, int c){
        System.out.println("the sum of three numbers is "+ (a+b+c));
    }

}
