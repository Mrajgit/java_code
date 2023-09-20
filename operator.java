public class operator {
    public static void main(String[] args) {
        boolean a= true;
        boolean b= false;
        System.out.println("and operator");
        if (a && b)
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("or operator");
        if (a || b)
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("not operator");
        System.out.println("!a is : "+!a);
        System.out.println("!b is : "+!b);
    }
}
