import java.util.Scanner;
public class recursion {
    static void ascending_order(int x){
        if (x>0)
        {
            System.out.println(x);
            ascending_order(x-1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the number :  ");
        a=sc.nextInt();
        ascending_order(a);
    }
}
