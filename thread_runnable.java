class MyThreadRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i am thread 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 150; i++) {
            System.out.println("i am thread 2");
        }
    }
}
public class thread_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
