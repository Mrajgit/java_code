import java.util.Scanner;
public class marka5sub {
    public static void main(String[] args) {
        System.out.println("enter five subject marks");
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,sum;
        float per;
        System.out.println("enter subject 1 numbers");
        a= sc.nextInt();
        System.out.println("enter subject 2 numbers");
        b= sc.nextInt();
        System.out.println("enter subject 3 numbers");
        c= sc.nextInt();
        System.out.println("enter subject 4 numbers");
        d= sc.nextInt();
        System.out.println("enter subject 5 numbers");
        e= sc.nextInt();
        System.out.println("enter subject 6 numbers");
        f= sc.nextInt();
        sum=a+b+c+d+e+f;
        System.out.println("total number   :   " +sum);
//        System.out.println(sum);
        per=(sum*100)/600f;
        System.out.println("percentage  :   " +per);
//        System.out.println(pre);
    }
}
