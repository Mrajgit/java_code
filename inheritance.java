class Base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("it is base class");
        this.x = x;
    }
    public void print(){
        System.out.println("this is a constructor");
    }
}
class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("it is derived class");
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Base  b =new Base();
        b.setX(20);
        System.out.println(b.getX());
        Derived d= new Derived();
        d.setY(30);
        d.setX(2222);
        System.out.println(d.getY());
        System.out.println(d.getX());
    }
}
