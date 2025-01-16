package Arrays.SlidingWindow;
import java.util.Scanner;
public class MaximumSubArrayOfSizeK {

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        solve(arr, n, k);

    }

    public static void solve(int[] arr, int n, int k){
        if(arr == null || n == 0 || k>n) {
            System.out.println("Invalid Input");
            return;
        }
        int left = 0, right = k, maxSum = 0,sum = 0;;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        maxSum = sum;
        while(right < arr.length){
            sum -= arr[left];
            left++;
            sum += arr[right];
            maxSum = Math.max(sum, maxSum);
            right++;
        }
        System.out.println(maxSum);
    }

    /*
    * Edge Cases to remember:
    * 1) Array size(n) less than k or array is null.
    * 2) Array with Negative numbers
    * 3) If all the elements are same
    */
}
