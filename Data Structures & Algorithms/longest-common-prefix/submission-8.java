class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        int l = 0;
        for(String str : strs){
             l = 0;
            while(l < str.length() && l < pre.length() && str.charAt(l) == pre.charAt(l)) l++;
            pre = pre.substring(0 , l);
        }
        return pre;
    }
}