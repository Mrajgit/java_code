import java.util.Scanner;
class cylinder{
    private int radius;
    private int height;
    public cylinder(int r, int h){
        this.radius = r;
        this.height = h;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class cylinder_a_v {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, h;
        System.out.print("enter the radius of cylinder :");
        r = sc.nextInt();
        System.out.print("enter the height of cylinder :");
        h = sc.nextInt();
        cylinder cyl = new cylinder(r,h);
        System.out.println("height :"+cyl.getHeight());
        System.out.println("height :"+cyl.getRadius());
        System.out.println("area of cylinder : "+cyl.surfaceArea());
        System.out.println("area of cylinder : "+cyl.volume());
    }
}
