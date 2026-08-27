class Solution {
    public int maxArea(int[] nums) {
        int l = 0 ;
        int r = nums.length - 1;
        int max = 0;
        while(l < r){
            int prod = Math.min(nums[l] , nums[r]) * (r - l  );
            max  = Math.max(prod , max);
            if(nums[l] > nums[r]) r--;
            else l++;
        }
        return max;
    }
}
