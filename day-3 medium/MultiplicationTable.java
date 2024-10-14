class Multiplication extends Thread {
    int number;

    public Multiplication(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread for " + number + " multiplication table is in RUNNABLE state");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread for " + number + " multiplication table is in TERMINATED state");
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        Multiplication table5 = new Multiplication(5);
        Multiplication table10 = new Multiplication(10);

        System.out.println("Starting Thread for 5's Multiplication Table (NEW state)");
        table5.start();
        System.out.println("Thread for 5's table is now in RUNNABLE state");

        System.out.println("Starting Thread for 10's Multiplication Table (NEW state)");
        table10.start();
        System.out.println("Thread for 10's table is now in RUNNABLE state");

        try {
            table5.join();
            table10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
