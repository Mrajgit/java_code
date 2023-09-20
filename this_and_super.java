import javax.print.Doc;
class c1{
    int a;
    public int getA(){
        return a;
    }
    c1(int a){
        this.a=a;
    }
    public int returnOne(){
        return 1;
    }
}
class c2 extends c1{
    c2(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}
public class this_and_super {
    public static void main(String[] args) {
    c1 e = new c1(45);
    c2 d = new c2 (34);
        System.out.println(e.getA());
    }
}
