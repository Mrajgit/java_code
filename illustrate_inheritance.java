//parent class
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}
// Main class
public class illustrate_inheritance {
    public static void main(String[] args) {
        // Creating an object of child class
        Dog myDog = new Dog();
        // Calling methods from parent and child class
        myDog.eat();
        myDog.bark();
    }
}