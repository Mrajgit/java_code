import java.util.LinkedList;

public class link_list_in_java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(12);
        l2.add(14);
        l2.add(13);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(4);
        System.out.println("linked list : "+ l1);
        l1.addLast(525);
        System.out.println("add item last in list : "+l1);
        l1.addFirst(123);
        System.out.println("add item first in list : "+l1);
        l1.add(0, 3);
        l1.add(4, 7);
//        l1.clear();
        l1.set(1, 34);
        System.out.println("item is present or not in list : "+l1.contains(25)); // the number is present in the list or not
        System.out.println(l1.indexOf(1)); // the number is present of at index (   )
        System.out.println(l1.lastIndexOf(4));

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("l1 array list : "+l1);
        System.out.println("l2 array list : "+l2);
        l1.addAll(0,l2);
        System.out.println("merging the list l1 and l2 :"+l1);
        l1.remove(0);
        System.out.println(l1);
    }
}
