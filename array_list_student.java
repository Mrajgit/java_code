import java.util.ArrayList;

public class array_list_student {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        for (Object o: ar) {
            System.out.println(o);
        }
    }
}
