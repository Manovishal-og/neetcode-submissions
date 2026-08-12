class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int st = 1;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < 0) nums[i] = 0;
            set.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(st) ) st++;
        }
        return st;
    }
}