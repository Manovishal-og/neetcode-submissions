class Solution {
    public int maxProfit(int[] nums) {
        int pro = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i - 1] < nums[i]) pro += nums[i] - nums[i - 1] ;
        }
        return pro;
    }
}