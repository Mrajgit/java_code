interface camera2{
    void takeSnap();
    void recordVideos();
    private void greet(){
        System.out.println("good Morning");
    }
    default void record4KVideos(){
        greet();
        System.out.println("Recording 4k videos now .........");
    }
}
interface wifi2{
    String[] getNetworks();
    void connectTONetwork(String network);
}
class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling :"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting ........");
    }
}
class SmartPhone2 extends CellPhone2 implements wifi, camera{
    public void takeSnap() {
        System.out.println("taking snaps......");
    }
    public void recordVideos() {
        System.out.println("record videos ........");
    }
    //    public void record4KVideos() {
//        System.out.println("recording 4k videos.......");
//    }
    public String[] getNetworks() {
        System.out.println("Getting Network list");
        String[] networkList = {"AIRTEL","JIO","VI"};
        return networkList;
    }
    public void connectTONetwork(String network) {
        System.out.println("connecting to "+network);
    }
}
public class polymorphism_in_interfaces {
    public static void main(String[] args) {
        camera cam = new SmartPhone2(); // it is a smartphone but use it as a camera
//        cam.getNetwork();   ---> not allowed
        cam.record4KVideos();

        SmartPhone2 s = new SmartPhone2();
        s.recordVideos();
        s.getNetworks();
        s.callNumber(123434);
    }
}
