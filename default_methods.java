interface camera{
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
interface wifi{
    String[] getNetworks();
    void connectTONetwork(String network);
}
class CellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("calling :"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting ........");
    }
}
class SmartPhone1 extends CellPhone1 implements wifi, camera{
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
public class default_methods {
    public static void main(String[] args) {
        SmartPhone1 sm= new SmartPhone1();
        sm. record4KVideos();
        String[] arr = sm.getNetworks();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
