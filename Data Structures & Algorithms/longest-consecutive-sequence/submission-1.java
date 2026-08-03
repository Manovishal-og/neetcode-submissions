class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int lon = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int length = 1;
                while(set.contains(i+length)) length++;
                lon = Math.max(lon , length);
            }
        }
        return lon;
    }
}
