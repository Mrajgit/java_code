class cellphone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("vibrate....");
    }
    public void calling(){
        System.out.println("calling friends....");
    }
}
public class custom_class_2 {
    public static void main(String[] args) {
        cellphone mi = new cellphone();
        mi.calling();
        mi.ring();
        mi.vibrate();
    }
}
