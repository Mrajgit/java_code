import java.util.ArrayList;
class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
    public void setVal(T1 t1){
        this.t1 =t1;
    }
}
public class generics_in_java {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList = new ArrayList();  // it is ony for integer
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(50);
        arrayList.add(30);
        arrayList.add(70);
//        arrayList.add("hello");
//        arrayList.add(10.5);
        System.out.println(arrayList);

//        int x = arrayList.get(0); // object cannot be converted to int
        int x = (int) arrayList.get(0);
        System.out.println(x);

        MyGeneric<String , Integer> g1 = new MyGeneric(23,"this is string ",45);
        String str = g1.getT1();
        Integer int1= g1.getT2();
        System.out.println(str+int1);
    }
}
