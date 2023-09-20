import java.util.HashSet;

public class hashset_in_java {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println("hashset : "+hs);
        System.out.println("the size of hashset : "+hs.size());
//        hs.clear();
//        System.out.println("after cleaning hashset : "+hs);
        System.out.println("hashset empty : "+hs.isEmpty());
        hs.remove(4);
        System.out.println("after removing element : "+hs);
    }
}
