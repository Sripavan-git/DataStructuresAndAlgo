package BinarySearch;

public class UpperBoundInBinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,4,6,7};
        int x = 5;
        int result = upperBound(arr, arr.length, x);
        System.out.println(result);
    }

    public static int upperBound(int []arr, int x, int n){
        int low = 0, high = n-1, ans = n;
        while(low <= high){
            int mid = (low + high)/2;

            // The only differenc in lower bound and upper bound is we will be trying to find the element
            // that is greater than the x
            if(arr[mid] > x){
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
