package BinarySearch;

import java.util.Arrays;

public class FloorAndCeil {

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] result = solve(nums, nums.length, x);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solve(int[] nums, int n, int x){
        int a = getFloor(nums, n , x);
        int b = getCeil(nums, n, x);
        return new int[]{a,b};
    }
    public static int getFloor(int[] nums, int n, int x){

        int low = 0, high = n - 1, ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int getCeil(int[] nums, int n, int x){
        int low = 0, high = n -1, ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
