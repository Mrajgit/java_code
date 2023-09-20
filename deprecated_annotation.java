class MyDeprecated{
    void meth1(){
        System.out.println("i am meth1............");
    }
}
public class deprecated_annotation {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")
        MyDeprecated d =new MyDeprecated();
        d.meth1();


    }
}
