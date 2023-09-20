interface animal{
    void bark();
}
class dog implements animal{
    @Override
    public void bark() {
        System.out.println("dog barks............");
    }
}

interface LambdaExpDemo{
    void meth(int a, int b);
}
public class anonymous_classes_lambda {
    public static void main(String[] args) {
        dog ba = new dog();
        ba.bark();

        LambdaExpDemo l = (a,b)->{
            System.out.println("this value of a and b is : "+ a+","+b);
        };
        l.meth(3, 5);
    }
}
