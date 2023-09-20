import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age : ");
        int a=sc.nextInt();
        switch (a){
            case 6:
                System.out.println("you are child ");
                break;
            case 18:
                System.out.println("you are young");
                break;
            case 60:
                System.out.println("you are retired");
                break;
            default:
                System.out.println("enjoy life");
                break;
        }
    }
}
