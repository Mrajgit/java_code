import java.util.Scanner;
class calculation{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class square_a {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
        System.out.print("Enter the side of square : ");
        a = sc.nextInt();
        calculation square = new calculation();
        square.side=a;
        System.out.println("the area is "+ square.area());
        System.out.println("the area is "+ square.perimeter());
    }
}
