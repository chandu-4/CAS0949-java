class FibonacciRunnable implements Runnable {
    int count;

    public FibonacciRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0, b = 1, c;
        for (int i = 0; i < count; i++) {
            if (i <= 1) System.out.print(i + " ");
            else {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}

public class Fibonacciseries {
    public static void main(String[] args) {
        int n = 5;
        Thread t = new Thread(new FibonacciRunnable(n));
        t.start();
    }
}
