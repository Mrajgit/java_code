class a{
    public int a;
    public int raj(){
        return 4;
    }
    public void meth1(){
        System.out.println("i am method 1 from class a");
    }
    public void meth2(){
        System.out.println("i am method 2 from class a");
    }
}
class b{
    public void meth1(){
        System.out.println("i am method 1 from class b");
    }
    public void meth2(){
        System.out.println("i am method 2 from class b");
    }
}
public class method_overloading {
    public static void main(String[] args) {
        a a = new a();
        a.meth1();
        b b = new b();
        b.meth1();
        a a2 = new a();
        a.meth2();
        b b2 = new b();
        b.meth2();
    }
}
