class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0)+ 1);
        }
        List<Integer>[] buck = new ArrayList[nums.length + 1];
        for(Integer n : map.keySet() ){
            int freq = map.get(n);
            if(buck[freq] == null) buck[freq] = new ArrayList<>();
            buck[freq].add(n);
        }

        int index = 0;
        int[] res= new int[k];
        for(int i = nums.length ; i >= 0 ; i--){
            if(buck[i] == null) continue;
            for(int n : buck[i]) res[index++] = n;
            if(index == k) return res;

        }
        return res;
    }
}
