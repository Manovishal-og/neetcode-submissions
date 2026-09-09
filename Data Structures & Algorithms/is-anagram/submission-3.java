class Solution {
    public boolean isAnagram(String s, String t) {
        int count[
            
        ] = new int[26];
        if(s.length() != t.length()) return false;
        int i = 0;
        while( i != t.length() ){
            count[t.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
            i++;
        }
        for(int j = 0 ; j < count.length ; j++){
            if(count[j] != 0) return false;
        }
        return true;

    }
}
