class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char i : str.toCharArray())
                count[i - 'a']++;
            if(!map.containsKey(Arrays.toString(count)))
                map.put(Arrays.toString(count) , new ArrayList<>());
            map.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

