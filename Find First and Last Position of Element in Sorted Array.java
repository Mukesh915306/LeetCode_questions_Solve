class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1,-1};
      // Binary Search for first occurence
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(left < n && nums[left] == target){
            ans[0] = left;
        }
        else{
            return ans;
        }
        //Binary Search for last occurence
        left = 0;
        right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        ans[1] = right;

        return ans;
    }
}
