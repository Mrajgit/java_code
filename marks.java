import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        byte a,b,c,d,e;
        System.out.println("enter the marks in english");
        a=sc.nextByte();
        System.out.println("enter the marks in hindi");
        b=sc.nextByte();
        System.out.println("enter the marks in science");
        c=sc.nextByte();
        System.out.println("enter the marks in mathematics");
        d=sc.nextByte();
        System.out.println("enter the marks in computer");
        e=sc.nextByte();
        float pre=(a+b+c+d+e)*100/600f;
        System.out.println("percentage is : "+pre);
        if(pre>40 && a>33 && b>33 && c>33 && d>33 && e>33)
        {
            System.out.println("you are pass you can join the collage");
        }
        else if(pre>40){
            System.out.println("you age pass");
        }
        else {
            System.out.println("you are failed");
        }
    }

}
