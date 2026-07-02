class Solution {
    public int longestConsecutive(int[] nums) {
       int max = 0;
       HashSet<Integer> set = new HashSet<>();
       for(int n : nums) set.add(n);
       for(int num : set){
            if(!set.contains(num - 1)){
                int length = 1;
                while(set.contains(num + length)) length++;
                max = Math.max(length , max);
            }
       }
       return max;
    }
}
