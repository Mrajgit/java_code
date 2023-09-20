import java.util.Scanner;
public class hello_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.println("enter your name : ");
//        a=sc.next();
        a=sc.nextLine();
        System.out.println("hello " +a+ " welcome to java programming language");
    }
}
