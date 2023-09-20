import java.util.Scanner;
public class factorial_recursion {
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            int x;
            x=a*factorial(a-1);
            return x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a;
        System.out.print("Enter the number, you want the print the factorial :  ");
        a=sc.nextInt();
        int c=factorial(a);
        System.out.println("the factorial of "+ a +" is =  "+c);
    }
}
