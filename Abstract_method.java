abstract class parents{
    public parents(){
        System.out.println("i am the constructor of base class");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class children extends parents{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet1(){
        System.out.println("good afternoon");
    }
}
abstract class child3 extends parents{
    public void th(){
        System.out.println("this is a book");
    }
}
public class Abstract_method {
    public static void main(String[] args) {
        children c= new children();
        c.greet();
        c.sayHello();
    }
}
