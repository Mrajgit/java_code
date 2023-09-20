public class javadocs_in_java {
        static void good()
        {

            System.out.println("good morning");
        }
        static void good (int x)
        {

            System.out.println("good morning "+ x +" three thousand");
        }
        static void good (int x, int y)
        {

            System.out.println("good morning "+ x +" and "+y+" thousand");
        }

//        java document generate java doc
    public static void main(String[] args) {
        good();
        good(4);
        good(3,66);
    }
}
