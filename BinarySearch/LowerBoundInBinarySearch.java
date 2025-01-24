package BinarySearch;

public class LowerBoundInBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 0;
        int result = lowerBound(arr, arr.length, x);
        System.out.println(result);
    }

    public static int lowerBound(int []arr, int n, int x) {
        int low = 0,high = n-1, ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
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
