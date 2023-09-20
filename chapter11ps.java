abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
    void write() {
        System.out.println("write for pen class");
    }

    @Override
    void refill() {
        System.out.println("refill for pen class");
    }
    void ChangeNib(){
        System.out.println("change Nid method for Change Nid class");
    }
}
class Monkey{
    void jump(){
        System.out.println("jump method for class Monkey");
    }
    void bite(){
        System.out.println("bite method for class Monkey");
    }
}
interface BaseAnimal{
    void eat();
    void sleeping();
}
class Human extends Monkey implements BaseAnimal{
    void speck(){
        System.out.println("hello sir jiiii.................");
    }
    @Override
    public void eat() {
        System.out.println("eat override ...........");
    }

    @Override
    public void sleeping() {
        System.out.println("sleeping override............");
    }

}
public class chapter11ps {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.ChangeNib();

        Human raj = new Human();
        raj.sleeping();

        Monkey m = new Monkey();
        m.jump();
        m.bite();

        BaseAnimal r = new Human();
        r.eat();
        r.sleeping();
    }
}
