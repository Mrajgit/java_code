import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i,t;
        System.out.println("enter the number :");
        n=sc.nextInt();
        for (i=1; i<=10;i++){
            t=n*i;
            System.out.println(n +" * "+i+" = "+t);
        }
    }
}
