class t3 extends Thread{
    public void run(){
            System.out.println("welcome");
    }
}
class t4 extends Thread{
    public void run(){
            System.out.println("good morning");
    }
}
public class practice_set1_13 {
    public static void main(String[] args) {
        t3 a = new t3();
        t4 b = new t4();
        a.start();
        b.start();
        a.setPriority(5);
        b.setPriority(1);

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        System.out.println(a.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
