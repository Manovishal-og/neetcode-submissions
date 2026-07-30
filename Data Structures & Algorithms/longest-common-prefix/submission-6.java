class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(String i : strs){
            int j = 0;
            while(j < prefix.length() && j < i.length() && prefix.charAt(j) == i.charAt(j)) j++;
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}