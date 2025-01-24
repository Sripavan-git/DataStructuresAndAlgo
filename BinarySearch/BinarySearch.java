package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int result = search(nums, target);
        System.out.println(result);
    }

    public static int search(int []nums, int target) {

        int n = nums.length;
        int low = 0, high = n -1;
        while(low <= high){
            int mid =(low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
