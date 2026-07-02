class Solution {
    public int removeElement(int[] nums, int val) {
        int uniq = 0;
        for(int i : nums){
            if( i != val)   nums[uniq++] = i;
        }
        return uniq;
    }
}