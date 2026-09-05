class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int j = 0;
        while(j < nums.length){
            res[j] = nums[j];
            res[nums.length + j] = nums[j];
            j++;
        }
        return res;
    }
}