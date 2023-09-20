import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);
        ad.add(9);
        System.out.println("arrayDeque : "+ad);
//        ad.offerFirst(56);
        ad.addFirst(56);
        System.out.println("after add first : "+ad);
        ad.offerLast(10);
        ad.addLast(45);
        System.out.println("after add last : "+ad);
      //        ad.removeFirst();
        ad.pollFirst();
        System.out.println("delete first index value : "+ad);
//        ad.removeLast();
        ad.pollLast();
        System.out.println("delete last index value : "+ad);
//        ad.getLast(); //last index value
        System.out.println("get last index value : "+ad.peekLast());

//        ad.getFirst(); //first index value
        System.out.println("get first index value : "+ad.peekFirst());

    }
}
