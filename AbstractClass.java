// Abstract class
abstract class Shape2 {
    // Abstract method
    public abstract void draw();
    public void display() {
        System.out.println("Displaying the shape.");
    }
}
class Circle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // Creating an object of child class
        Circle2 myCircle = new Circle2();

        // Calling methods from abstract and concrete methods
        myCircle.draw();
        myCircle.display();
    }
}
