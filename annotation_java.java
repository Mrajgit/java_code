
class newPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("the time is 3 PM");
    }
    @Deprecated
    public int  sum(int a, int b){
        return a+b;
    }
}
public class annotation_java {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        System.out.println("functional interface annotation");
        newPhone p = new newPhone();
        p.showTime();
        p.sum(4,6);
    }
}
