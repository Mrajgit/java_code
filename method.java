import java.util.Scanner;
public class method {
    static int mul(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c ;
        System.out.println("enter the numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+ " " +b);
       c=mul(a, b);
        System.out.println(c);
        int a1, b1;
        a1=3;
        b1=2;
        int c1=mul(a1,b1);
        System.out.println(c1);
    }
}
