import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        System.out.println("addition of two number");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
//        int a=sc.nextInt();
        float a= sc.nextFloat();
        System.out.println("enter second number");
//        int b=sc.nextInt();
        float b= sc.nextFloat();
//        int sum =a+b;
        float sum= a+b;
        System.out.println("sum of two numbers");
        System.out.println(sum);
    }
}
