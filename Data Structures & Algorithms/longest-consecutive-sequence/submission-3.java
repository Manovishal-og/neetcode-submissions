class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int lon = 0;
        for(int i : set){
            int len = 1;
            if(!set.contains(i -1)) {
                while(set.contains(i+len))len++;
            }
            lon = Math.max(lon , len);
        }
        return lon;
    }
}
