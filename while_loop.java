import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,i=1;
        System.out.println("how many number you want to print :");
        n=sc.nextInt();
        while (i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("in reversed order ");
        while (n!=0){
            System.out.println(n);
            n--;
        }
    }
}
