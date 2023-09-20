import java.util.Scanner;
public class fibonacci_series {

    static void fibonacci1(int x){
        System.out.println("by the loop");
      int a=0, b=1,c;
        for (int i = 0; i <x; i++) {
            System.out.print(a+", ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println("by the recursion");
    }
    static int fibonacci2(int a){
        if(a<=1)
            return a;
            return (fibonacci2(a-1)+fibonacci2(a-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the number : ");
        a=sc.nextInt();
        fibonacci1(a);
        int b=fibonacci2(a);
        System.out.print(b+", ");
    }
}
