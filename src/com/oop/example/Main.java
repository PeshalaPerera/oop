package com.oop.example;


import com.oop.example.abstraction.Female;
import com.oop.example.abstraction.Male;
import com.oop.example.abstraction.interfaces.IFemale;
import com.oop.example.abstraction.interfaces.IHuman;
import com.oop.example.abstraction.interfaces.IMale;
import com.oop.example.encapsulation.Person;
import com.oop.example.inheritance.Car;
import com.oop.example.polymorphism.Animal;
import com.oop.example.polymorphism.Dog;
import com.oop.example.polymorphism.Pig;

public class Main {

    public static void main(String[] args) {
        testEncapsulation();
        testInheritance();
        testPolymorphism();
        testAbstraction();
    }

    public static void testEncapsulation() {
        Person person = new Person();
        // person.name = "John";  will throw error
        // System.out.println(person.name);  will throw error
        person.setName("John");
        System.out.println(person.getName());
    }

    public static void testInheritance() {
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.getBrand() + " " + myCar.getModelName());
    }

    public static void testPolymorphism() {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

    public static void testAbstraction() {
        // Human myHuman = new Human(); will throw error
        Male male = new Male();
        Female female = new Female();
        male.gender();
        female.gender();
        male.eat();
        female.eat();

        IHuman iMale = new IMale();
        IHuman iFemale = new IFemale();
        iMale.canMakeBabies();
        iFemale.canMakeBabies();
    }
}
