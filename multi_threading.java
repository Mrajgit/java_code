class MyThread1 extends Thread{
    public  void run(){
        int i=0;
        while(i<400000){
            System.out.println("Running Thread 1 ...........");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyTread2 extends Thread{
    public  void run(){
        int i=0;
        while(i<400000){
            System.out.println("Running Thread 2 ...........");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class multi_threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyTread2 t2 = new MyTread2();
        t1.start();
        t2.start();
    }
}
