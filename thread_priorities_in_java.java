class MyThreads extends Thread{
    public MyThreads(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thank you"+this.getName());
        }
    }
}
public class thread_priorities_in_java {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads("raj1");
        MyThreads t2 = new MyThreads("raj2");
        MyThreads t3 = new MyThreads("raj3");
        MyThreads t4 = new MyThreads("raj4");
        MyThreads t5 = new MyThreads("raj5 (most important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
