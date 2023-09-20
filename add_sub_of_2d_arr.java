import java.util.Scanner;
public class add_sub_of_2d_arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,i,j;
        int [][] x= new int[10][10];
        int [][] y= new int[10][10];
        int [][] result= new int[10][10];
        System.out.print("enter the size of matrix (row and column) ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the element of first matrix : ");
        for (i = 0; i < a; i++) {
            for(j=0;j<b;j++){
                System.out.print("A"+(i+1)+(j+1)+" = ");
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("enter the element of second matrix : ");
        for (i = 0; i < a; i++) {
            for(j=0;j<b;j++){
                System.out.print("B"+(i+1)+(j+1)+" = ");
                y[i][j]=sc.nextInt();
            }
        }
        System.out.println("first matrix :");
        for (i = 0; i < a; i++) {
            for(j=0;j<b;j++){
                System.out.print(x[i][j]+"\t\t");
            }
            System.out.println();
        }
        System.out.println("second matrix :");
        for (i = 0; i < a; i++) {
            for(j=0;j<b;j++){
                System.out.print(y[i][j]+"\t\t");
            }
            System.out.println();
        }
        System.out.println("addition of two matrix :");
        for(i=0;i<a;i++){
            for (j = 0;  j<b ; j++) {
                result[i][j]=x[i][j]+y[i][j];
                System.out.print(result[i][j]+"\t\t");
            }
            System.out.println();
        }
        System.out.println("subtraction of two matrix :");
        for(i=0;i<a;i++){
            for (j = 0;  j<b ; j++) {
                result[i][j]=x[i][j]-y[i][j];
                System.out.print(result[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
