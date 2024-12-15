// Thread Lifecycle
class ThreadLifecycleDemo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in running state...");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep...");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted...");
        }
        System.out.println(Thread.currentThread().getName() + " is terminating...");
    }
}

public class Main {
    public static void main(String args[]) {
        Thread t = new ThreadLifecycleDemo();
        System.out.println(t.getName() + " in new State.");
        t.start();
        System.out.println(t.getName() + " in Runnable state");
        try{
            t.join(); //ensure main thread waits for other thread to finish
        }catch(Exception e){
            System.out.println("Main thread was interuptted..");
        }
        System.out.println(t.getName() + " is Terminated..");
    }
}
