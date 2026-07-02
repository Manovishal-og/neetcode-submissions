public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String , List<String> > map = new HashMap<>();
        for(String str : strs){
            int count[] = new int[26];
            for(char c : str.toCharArray()) count[c - 'a']++;
            map.putIfAbsent(Arrays.toString(count) , new ArrayList<>());
            map.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}