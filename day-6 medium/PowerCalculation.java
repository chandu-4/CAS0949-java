public class PowerCalculation {
    public static double pow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println("Result: " + pow(x, n));
    }
}
