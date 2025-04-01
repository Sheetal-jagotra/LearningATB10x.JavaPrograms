package Task20Feb;

import java.awt.*;

import static java.awt.Color.red;

public class Inheritance {
    public static void main(String[] args) {
      Tata obj = new Tata(2011,150);

      obj.type();
      obj.color();
      System.out.println("--------------------------");
      obj.details();

    }
}
class Cars{
    String type;
    String color;

        void type(){
            System.out.println("the type of car is Manual");
        }
        void color(){
            System.out.println("the color of the car is red");
        }

}
class Tata extends Cars{
    int model;
    int max_speed;
    Tata(int model, int max_speed){
        super();
    }
     void model(){
         System.out.println("the model of the car is"+model);
    }
    void max_speed(){
        System.out.println("the max speed of the car is "+ max_speed);
    }
    void details(){
        System.out.println("the type of car is manual");
        System.out.println("the color of the car is red");
        System.out.println("the model of the car is 2011");
        System.out.println("the max speed of the car is 150kmph");
    }
}