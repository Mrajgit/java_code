import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t,i=1;
        System.out.println("enter the number : ");
        n=sc.nextInt();
        System.out.println("the table of "+n);
        do{
            t=i*n;
//            System.out.println(t);
            System.out.println(n +" * "+i+" = "+t);
            i++;

        }while (i<=10);
    }
}
