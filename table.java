import java.util.Scanner;
public class table {
    static void table(int x){
        int i,t;
        for (i=1; i<=10; i++) {
            t = x * i;
        System.out.println(x +" * "+ i +" = "+ t);
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("enter the number : ");
        a=sc.nextInt();
        table(a);
    }
}
