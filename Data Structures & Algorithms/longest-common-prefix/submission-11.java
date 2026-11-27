class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int k = 0;
        for(String s : strs){
            k = 0;
            while(k < s.length() && k < str.length() && s.charAt(k) == str.charAt(k))
            k++;
            str = str.substring(0,k);

        }
        return str;
    }
}