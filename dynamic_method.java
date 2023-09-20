class phone{
    public void showTime(){
        System.out.println("the time is 3 am");
    }
    public void on(){
        System.out.println("turning on phone......");
    }
}
class smartphone extends phone {
    public void music(){
        System.out.println("playing music......");
    }
    public void on(){
        System.out.println("turning on smartphone........");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
        phone p12 = new phone();
        smartphone p2 = new smartphone();

        phone p1 =new smartphone();
//        smartphone p2 = new phone() // not allowed
        p1.showTime();
        p1.on();
        p2.music();
    }
}
