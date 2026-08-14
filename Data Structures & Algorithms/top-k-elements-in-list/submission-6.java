class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : nums) map.put(i , map.getOrDefault(i , 0)+1);
        List<Integer> ans[] = new ArrayList[nums.length + 1];
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(ans[freq] == null) ans[freq] = new ArrayList<>();
            ans[freq].add(i);
        }

        int[] res = new int[k];
        k--;
        int i = nums.length + 1;
        while(k >= 0){
            i--;
            if(ans[i] == null){
                continue;
            } 
            for(int j = 0 ; j < ans[i].size() ; j++ ){
                res[k--]  = ans[i].get(j);
                if(k == -1) return res;
            }
        }
        return res;
    }
}
