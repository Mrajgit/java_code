class base1{
    base1(){
        System.out.println("i am constructor");
    }
    base1(int x){
        System.out.println("I am an overloaded constructor base with value of x : "+x);
    }
}
class derived1 extends base1{
    derived1(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor derived with value of y : "+y);
    }
}
class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor child with value of z : "+z);
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d1 = new derived1(23, 45);
//        childOfDerived cd = new childOfDerived();
        childOfDerived cd1 = new childOfDerived(23 , 54 , 456);
    }
}
