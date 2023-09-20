import  java.util.Scanner;
public class string_print {
    public static void main(String[] args) {
//        String a= new String("raj");
        String a="raj";
        System.out.print("my name is ");
        System.out.println(a);
        int x=45;
        float y = 4.6f;
        System.out.printf("the value x is %d and value y is %f\n",x,y); //format and printf those are same
        System.out.format("the value x is %d and value y is %8.2f",x,y);
        Scanner sc= new Scanner(System.in);
//        String st= sc.next();
        String st= sc.nextLine();
        System.out.println(st);
    }
}
