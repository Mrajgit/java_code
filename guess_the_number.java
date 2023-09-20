import java.util.Scanner;
import java.util.Random;
public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,n,i=1;
        System.out.print("Enter the number between 1 to 100 : ");
        Random rand = new Random();
        n = rand.nextInt(100);
//        System.out.println(n);
        do {
            a =sc.nextInt();
            if (a < 100) {
                if (a > n) {
                    System.out.println("smaller number please ");
                } else if (a < n) {
                    System.out.println("big number please ");
                } else {
                    System.out.println("you guesses the right number ");
                }
            }
            else {
                System.out.println("WRONG CHOICE");
            }
            i++;
        }while(a!=n);
    }
}
