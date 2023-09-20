// First interface
interface Shape1 {
    public void draw();
}
// Second interface
interface Color {
    public void setColor(String color);
}
// Child class implementing both interfaces
class Circle1 implements Shape1, Color {
    private String color;
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting color of the circle to " + color + ".");
    }
    public void display() {
        System.out.println("Displaying a circle with color " + color + ".");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        // Creating an object of child class
        Circle1 myCircle = new Circle1();

        // Calling methods from both interfaces
        myCircle.draw();
        myCircle.setColor("red");
        myCircle.display();
    }
}
