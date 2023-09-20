import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 2;
        marks[1] = 26;
        marks[2] = 23;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index : ");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to the java class");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index is not exists");
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("exception in lever 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}
