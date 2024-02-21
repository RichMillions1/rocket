package rocket.LeetCode;

class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums, target, 0, nums.length-1); 

    }

    public int binarySearch(int[] nums, int target, int low, int high){
        if(target < nums[low] || target > nums[high] || low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(target < nums[mid]){
            return binarySearch(nums, target, low, mid-1);
        }else if(target > nums[mid]){
            return binarySearch(nums, target, mid+1, high);
        }else{
            return mid;
        }


    }
}