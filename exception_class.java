import java.util.Scanner;
class exception extends Exception{
    public String toString(){
        return "i am toString()";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}class age_exception extends Exception{
    public String toString(){
        return "age can not be greater than 233";
    }
    public String getMessage(){
        return "make sure that the value of age entered is correct";
    }
}
public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
    }
}
