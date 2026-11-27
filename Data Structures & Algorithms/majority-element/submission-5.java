class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;
        int ma = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == ma) vote++;
            else {
                if(vote == 0){
                    ma = nums[i];
                    vote++;
                }

                else vote--;
            }
        }
        return ma;
    }
}