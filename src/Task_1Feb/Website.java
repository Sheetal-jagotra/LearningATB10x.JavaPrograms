package Task_1Feb;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the website");
        String name = obj.nextLine();
        if(name.contains(".com")){
            System.out.println("It is a commercial website");
        }
        else if(name.contains(".org")){
            System.out.println("It is a Non- Profit website");
        }
        else if(name.contains(".edu")){
            System.out.println("It is an Educational website");
        }
        else if(name.contains(".gov")){
            System.out.println("It is a Government website");
        }
        else if(name.contains(".net")){
            System.out.println("It is a Network related website");
        }
        else if(name.contains(".info")){
            System.out.println("It is a informational website");
        }
        else{
            System.out.println("It is an unknown website");
        }
    }
}
