class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
    }
}
public class thread_constructors {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Lalit");
        MyThread t2 = new MyThread("raj");

        t1.start();
        t2.start();

        System.out.println("the id of the thread t1 is "+ t1.getId());
        System.out.println("the id of the thread t1 is "+ t1.getName());
        System.out.println("the id of the thread t2 is "+ t2.getId());
        System.out.println("the id of the thread t2 is "+ t2.getName());
    }
}
