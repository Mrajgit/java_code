import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the year ");
        a=sc.nextInt();
        if((a%4==0)&&(a%100!=0)||(a%400==0)){
            System.out.println("year is leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
