import java.util.*;
public class Main {
    private static final HashMap<Integer, Integer> memo = new HashMap<>();
    public int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fib(n-1)+fib(n-2);
        memo.put(n,result);
        return result;
    }
        public static void main(String[] args) {
            Main obj = new Main();
            int n = 10;
            System.out.println(obj.fib(n));

        }
    }