//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n<0){
            x=1/x;
            n=-n;
        }
        return xPown(x,n);
    }
    public double xPown(double x, int n){
        if (n == 0) {
            return 1;
        }

        double half = xPown(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
            Solution solution = new Solution();

            System.out.println(solution.myPow(2, 3));
    }
}