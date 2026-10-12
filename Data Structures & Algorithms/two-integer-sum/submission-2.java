class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] count = new int[2];
        count[0] = -1;
        count[1] = -1;
        for(int i = 0 ; i < nums.length ; i++){
            int com = target - nums[i];
            if(!map.containsKey(com))
                map.put(nums[i] , i);
            else{
                count[0] = map.get(com);
                count[1] = i;
                return count;
            }
        }
        return count;
    }
}
