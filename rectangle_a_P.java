import java.util.Scanner;
class rectangle{
    int side1,side2;
    public int area(){
        return side1*side2;
    }
    public int perimeter(){
        return 2*(side1+side2);
    }
}
public class rectangle_a_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1,s2;
        System.out.println("Enter the sides of rectangle ");
        System.out.print("enter the width of rectangle : ");
        s1 = sc.nextInt();
        System.out.print("enter the length of rectangle : ");
        s2 = sc.nextInt();
        rectangle rect = new rectangle();
        rect.side1 = s1;
        rect.side2 = s2;
        System.out.println("the area of rectangle is : "+rect.area());
        System.out.println("the perimeter of rectangle is : "+rect.perimeter());
    }
}
