public class Main {
    public static int lengthOfLastWord(String s){
        s=s.trim();
        int n = s.length();
        int count=0;
        for(int i = n-1; i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "luffy is joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}