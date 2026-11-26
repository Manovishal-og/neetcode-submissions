class Solution {
    public String longestCommonPrefix(String[] strs) {
        String  s = strs[0];
        int k = 0;
        for(int i = 1 ; i < strs.length ; i++){
            String st = strs[i];
            k = 0;
            while(k < st.length() && k < s.length() && st.charAt(k) == s.charAt(k)) k++;  
            s = s.substring(0 , k);
        }
        return s;
    }
}