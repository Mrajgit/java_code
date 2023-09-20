class c{
    public int x=23;
    protected int y = 45;
    int z= 56;
    private int a = 34;
    public void print(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class access_modifiers {
    public static void main(String[] args) {
        c c1 = new c();
        c1.print();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.a); // it is not access because this is private method
    }
}
