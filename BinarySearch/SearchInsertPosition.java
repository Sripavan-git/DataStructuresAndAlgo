package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1, ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            // Lower bound problem can be applicable here as we were getting the possible index where arr[i] >= x in the lower bound problem

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
