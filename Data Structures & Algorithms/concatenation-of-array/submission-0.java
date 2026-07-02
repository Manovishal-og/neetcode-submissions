class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] re = new int[nums.length*2];
        int j = 0;
        for(int i : nums) re[j++] = i;
        for(int i : nums) re[j++] = i;
        return re;
    }
}