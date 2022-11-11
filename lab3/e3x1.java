public class e3x1 {
    public static void main(String[] args) {
        int n = 1;
        int m = -1;
        if (n < -m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }

        if (-n >= m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }

        double x = 0.0;
        double y = 1.0;
        if (Math.abs(x - y) < 1.0) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        x = Math.sqrt(2.0);
        y = 2.0;
        if (x * y == y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

    }
}
