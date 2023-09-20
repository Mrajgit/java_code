abstract class TelePhone{
  abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    @Override
    void ring() {
        System.out.println("ringing..................");
    }

    @Override
    void lift() {
        System.out.println("lifting.......................");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting......................");
    }
}
public class polymorphism_q {
    public static void main(String[] args) {
        SmartTelePhone sm = new SmartTelePhone();
        sm.ring();
        sm.lift();
        sm.disconnect();
    }
}
