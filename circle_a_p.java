import java.util.Scanner;
class circle{
    int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public int diameter(){
        return 2*radius;
    }
}
public class circle_a_p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter the sides of rectangle ");
        System.out.print("enter the radius of circle : ");
        r = sc.nextInt();
        circle ct = new circle();
        ct.radius = r;
        System.out.println("the area of circle is : "+ct.area());
        System.out.println("the circumference of circle is : "+ct.circumference());
        System.out.println("the diameter of circle is : "+ct.diameter());
    }
}
