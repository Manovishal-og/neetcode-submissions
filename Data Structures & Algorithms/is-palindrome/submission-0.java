class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ne = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                ne.append(Character.toLowerCase(c));
        }
        return ne.toString().equals(ne.reverse().toString()) ;

    }
}
