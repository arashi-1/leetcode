public class Main {
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9};
        int target = 6;
        int result = binarySearch(nums, target);
        System.out.println(result);
    }

}
