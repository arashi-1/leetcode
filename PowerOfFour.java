public class Main {
    public boolean isPowerOfFour(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1))==0 && (n-1)%3==0;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int n = 8;
        System.out.println(obj.isPowerOfFour(n));
    }
}