

class circles{
    public int radius;
    circles(){
        System.out.println("i am non param of circle");
    }
    circles(int r){
        System.out.println("i am circle parameterized constructor");
        this.radius= r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinders extends circles{
    public int height;
    cylinders(int r, int h){
        super(r);
        System.out.println("i am cylinder parameterize constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class circle_and_cylinder {
    public static void main(String[] args) {
        cylinders a = new cylinders(12, 4);
        System.out.println("the volume of cylinder is : "+a.volume());
        System.out.println("the are of circle is : "+a.area());
    }
}
