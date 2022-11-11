import java.io.PrintStream;

public class e2x6 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "World";
        PrintStream var10000 = System.out;
        int var10001 = s.length() + t.length();
        var10000.println("" + var10001 + "\n b= " + s.substring(1, 2) + "\nc= " + s.substring(s.length() / 2, s.length()) + "\nd= s+t=" + s + t + "\ne= t+s=" + t + s);
    }
}
