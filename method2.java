import java.util.Scanner;
public class method2 {
    static void good()
    {
        System.out.println("good morning");
    }
    static void good (int x)
    {
        System.out.println("good morning "+ x +" three thousand");
    }
    static void good (int x, int y)
    {
        System.out.println("good morning "+ x +" and "+y+" thousand");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int a,b;
        a=sc.nextInt();
        good();
        good(a);
        b=sc.nextInt();
        good(a,b);
    }
}
