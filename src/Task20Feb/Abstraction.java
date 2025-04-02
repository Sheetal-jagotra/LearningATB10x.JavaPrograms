package Task20Feb;

public class Abstraction {
    public static void main(String[] args) {
         FormalWardrobe formalWardrobe = new FormalWardrobe();
         formalWardrobe.printNumberOfDresses();
    }
}
abstract class Wardrobe{
    abstract void dressType();
    abstract int numberOfDresses();
    void printNumberOfDresses(){
        System.out.println("number of dresses" +numberOfDresses());
    }
}
class CasualWardrobe extends Wardrobe{
    @Override
    void dressType() {
        System.out.println("Wardrobe is for Casuals");
    }

    @Override
    int numberOfDresses() {
        return 5;
    }
}
class EthnicWardrobe extends Wardrobe{
    @Override
    void dressType() {
        System.out.println("Wardrobe is for Ethnic wear");
    }

    @Override
    int numberOfDresses() {
        return 8;
    }
}
class FormalWardrobe extends Wardrobe{
    @Override
    void dressType() {
        System.out.println("Wardrobe is for Formals");
    }

    @Override
    int numberOfDresses() {
        return 6;
    }
}