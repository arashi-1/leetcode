//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testCases = {1, 2, 3, 4, 16, 218};

        for (int n : testCases) {
            if (isPowerOfTwo(n)) {
                System.out.println(n + " is a power of two.");
            } else {
                System.out.println(n + " is not a power of two.");
            }
        }
    }
}