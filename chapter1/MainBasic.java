package chapter1;
import java.util.*;

import otherFolder.SunFlower;
/** 
 * this is a sample class for CIICC batch 3
 */
public class MainBasic{
    public static void main(String[] args) {
        System.out.println("hello world");
        Random r = new Random();
        Toy toy4 = new Toy();
        Fruit f1 = new Fruit();
        SunFlower sf = new SunFlower();
        // this is a single line comment

        /*
         *this
         is 
         a 
         multi line
         comment 
         */
    }
}
class Car{
    int year;
    String make;
    String model;
    String color;
}
class Basic2{
    MainBasic mb;
    Car car1 = new Car();
    Car car2 = new Car();
}