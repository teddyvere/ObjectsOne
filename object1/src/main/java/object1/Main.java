package object1;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        // Declare and initialize an object
        Person person1 = new Person("John", 30,158);

        /* Now you can use the Object `person1` */
        System.out.println(person1.height);

        // Declaring car object
        Car car1 = new Car("Honda", "Civic", 2015, 1300);


        System.out.println(car1.getModel());

        // Declaring Chair object
        Chair chair1 = new Chair("wood", "brown", 4, "rectangle");

        System.out.println(chair1.getLegs());

        // Declaring Dog object
        Dog dog1 = new Dog("Rover", 7, "Bloodhound", "black", true);

        System.out.println(dog1.getName());

        // Experementing with arrays
        Dog[] dogs = new Dog[10];

        dogs[0] = dog1;

        System.out.println(dogs[0].getGoodBoy());








    }
}
