// Parent class
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
    public void draw(String color) {
        System.out.println("Drawing a generic shape with color " + color + ".");
    }
}
// Child class
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    // Overloading the draw method
    public void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius + ".");
    }
}
// Main class
public class OverloadingAndOverriding {
    public static void main(String[] args) {
        // Creating an object of child class
        Circle myCircle = new Circle();

        // Calling methods from parent and child class
        myCircle.draw();
        myCircle.draw("red");
        myCircle.draw(5);
    }
}
