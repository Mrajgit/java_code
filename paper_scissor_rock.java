import java.util.Scanner;
import java.util.Random;
public class paper_scissor_rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ui,ci;
        System.out.println("Enter the number 0 , 1 or 2");
        System.out.println("0 = PAPER");
        System.out.println("1 = SCISSOR");
        System.out.println("2 = ROCK");
        Random random = new Random();
        ci = random.nextInt(3);
        System.out.println(ci);
        ui = sc.nextInt();
        if(ui ==0 || ui ==1 || ui ==2) {
            if (ui == ci) {
                System.out.println("THE GAME IS DRAW");
            }
            else if (ui == 0 & ci == 2) {
                System.out.println("you won the game");
            } else if (ui== 0 & ci == 1) {
                System.out.println("computer won the game");
            }else if (ui == 1 & ci == 0) {
                System.out.println("you won the game");
            } else if (ui== 1 & ci == 2) {
                System.out.println("computer won the game");
            }else if (ui == 2 & ci == 1) {
                System.out.println("you won the game");
            } else if (ui== 2 & ci == 0) {
                System.out.println("computer won the game");
            }
            System.out.println("computer choice : ");
            if (ci == 0) {
                System.out.println("PAPER");
            } else if (ci == 1) {
                System.out.println("SCISSOR");
            } else if (ci == 2) {
                System.out.println("ROCK");
            }
        }
        else{
            System.out.println("WRONG CHOICE");
        }
    }
}
