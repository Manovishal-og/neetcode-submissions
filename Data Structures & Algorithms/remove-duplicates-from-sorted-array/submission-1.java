class Solution {
    public int removeDuplicates(int[] nums) {
        int uni = 0;
        for(int i  = 1 ;  i < nums.length ; i++  ){
            if(nums[i - 1] != nums[i]) nums[uni++] = nums[i-1];
        }
        nums[uni++] = nums[nums.length - 1];
        return uni;
    }
}