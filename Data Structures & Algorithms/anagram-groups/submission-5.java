class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        
        for(String str : strs){
            int[] count =  new int[26];
            for(char i : str.toCharArray()){
                count[i - 'a']++;
            }
            String cou = Arrays.toString(count);
            if(!map.containsKey(cou))
                map.put(cou , new ArrayList<>());
            map.get(cou).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

