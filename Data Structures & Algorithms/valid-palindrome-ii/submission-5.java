class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int e =  s.length() - 1;
        

        while(i < e){
            if(s.charAt(i) != s.charAt(e))
                return isP(s,i+1 , e) || isP(s,i,e-1);
            i++;
            e--;

        }
        return true;
    }

    public boolean isP(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}