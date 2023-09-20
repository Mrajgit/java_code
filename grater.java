import java.util.Scanner;
public class grater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the number you want to compare : ");
        System.out.println("1 : ");
        a=sc.nextInt();
        System.out.println("2 : ");
        b=sc.nextInt();
        System.out.println("3 : ");
        c=sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is grater");
        } else if (b>a && b>c) {
            System.out.println("b is grater");
        } else if (a == (b = c)) {
            System.out.println("all no are equal");

        } else {
            System.out.println("c is grater");
        }
    }
}
