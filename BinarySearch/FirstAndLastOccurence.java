package BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int first = findFirst(nums, nums.length, target);
        int last = findLast(nums, nums.length, target);
        System.out.println(first + " " + last);
    }

    public static int findFirst(int[] nums, int n,int x){
        int low = 0, high = n-1, first = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }

    public static int findLast(int[] nums, int n, int x){
        int low=0, high = n-1, last = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return last;
    }


    public static int[] bruteForceApproach(int[] arr, int x){
        int n = arr.length;
        int first = -1, last = -1;
        for(int i=0;i<n-1;i++){
            if(arr[i] == x){
                if(first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[]{first,last};
    }
}
