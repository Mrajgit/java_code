import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a;
        float tax=0;
        System.out.println("enter your income : ");
        a=sc.nextFloat();
        if(a<=2.5f)
        {
            System.out.println("you not pay any tax ");
        }
        else if (a>2.5f && a<=5.0f)
        {
            tax=tax+0.05f*(a-2.5f);
            System.out.println("you pay tax : "+tax);
        }
        else if (a>5.0f && a<=10.0f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.10f*(a-2.5f);
            System.out.println("you pay tax : "+tax);
        }else if (a>10.0f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.10f*(10.0f-5.0f);
            tax=tax+0.20f*(a-10.0f);
            System.out.println("you pay tax : "+tax);
        }
    }
}
