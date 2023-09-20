class MyThreads1 extends Thread{
        public void run(){
            int i =0;
            while (true){
                System.out.println("Thank you");
                try{
                    Thread.sleep(455);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
public class thread_method {
    public static void main(String[] args) {
    MyThreads1 t1 = new MyThreads1();
    MyThreads1 t2 = new MyThreads1();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
