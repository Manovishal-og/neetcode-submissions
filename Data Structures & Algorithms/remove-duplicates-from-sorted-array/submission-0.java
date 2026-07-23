class Solution {
    public int removeDuplicates(int[] nums) {
        int uni = 1;
        for(int i  = 1 ;  i < nums.length ; i++  ){
            if(nums[i - 1] != nums[i]) nums[uni++] = nums[i];
        }
        return uni;
    }
}