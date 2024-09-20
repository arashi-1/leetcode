//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = main.twoSum(nums,target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}

