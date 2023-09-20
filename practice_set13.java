import java.util.ArrayList;
class t1 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
class t2 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
public class practice_set13 {
    public static void main(String[] args) {
        t1 a1 = new t1();
        t2 a2 = new t2();
        a1.start();
        a2.start();
    }
}
