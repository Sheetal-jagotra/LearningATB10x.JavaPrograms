package Task20Feb;

public class Encapsulation {

    public static void main(String[] args) {
        Bank obj = new Bank("Axis",1000);
        obj.setName("hdfc");
        obj.getName();
        System.out.println("name is "+ obj.getName());
        obj.setBalance(50000 , true);
        System.out.println("balance is "+ obj.getBalance());
    }
}

class Bank{
    private String name;
    private int balance;

    public Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance , boolean isCashier) {
        if(isCashier){
            this.balance = balance;
        }
        else {
            System.out.println("Not allowed to set the balance");
        }

    }
}