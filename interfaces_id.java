import javax.crypto.spec.PSource;

interface Bicycle{
    int a= 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x=344;
    void blowHorn();
    void BlowHornIn();
}
class AvonCycle implements Bicycle, HornBicycle{
    void BlowHorn(){
        System.out.println("pee pee pee pee.....");
    }
    public void applyBrake(int decrement){
        System.out.println("apply brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speedup");
    }

    @Override
    public void blowHorn() {
        System.out.println("pee pee pee ...............................");
    }

    @Override
    public void BlowHornIn() {
        System.out.println("po po po po ..................");
    }
}
public class interfaces_id {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.applyBrake(1);
        System.out.println(c.a);
        System.out.println(c.x);
        c.blowHorn();
        c.BlowHornIn();
    }
}
