class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer>[] count = new ArrayList[nums.length+1];
        for(int i : nums) map.put( i , map.getOrDefault(i,0)+1);
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(count[freq] == null) count[freq] = new ArrayList<>();
            count[freq].add(i);
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = nums.length  ; i >= 0 ; i--){
            if(count[i] == null) continue;
            for(int n : count[i]){
                res[index++] = n;
                if(index == k) return res;
            }
            

        }
        return res;
    }
}
