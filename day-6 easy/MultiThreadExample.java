class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " is running...");
            Thread.sleep(500); // Sleep for 500 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println(threadName + " has finished execution.");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
}
