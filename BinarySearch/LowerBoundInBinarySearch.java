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
            // We try to find the element that is >= x and also the smallest possible index
            if(arr[mid] >= x){
                ans = mid;  // we assume the smallest that is found untill is mid everytime untill the smallest index is found.
                high = mid - 1; // we will the search for the smallest index possible
            }
            else{
                low = mid + 1; // if the arr[mid] < x then we will try to find the other half of the search space.
            }
        }
        return ans;
    }
}
