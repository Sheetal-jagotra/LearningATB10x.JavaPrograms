package Task21Feb;

public class Overriding {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.display();
        Cars cars = new Cars();
        cars.display();


        }
    }
class Cars{
    int speed=180;
    int model=2011;

    void color(){
        System.out.println("the color of the car is red");
    }
    void display(){
        System.out.println("the speed of the car is "+ speed);
        System.out.println("the model of the car is "+ model);
        System.out.println("the color of the car is red");

    }
}
class Toyota extends Cars{
    int speed=200;

   @Override

    void color(){
        System.out.println("the color of the car is white");
    }

    @Override
    void display(){
        System.out.println("the speed of the car is "+ speed);
        System.out.println("the color of the car is white ");
    }
}