class Solution {
    public String longestCommonPrefix(String[] strs) {
        String uniq = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            int j = 0;

            while (j < uniq.length() &&
                   j < word.length() &&
                   uniq.charAt(j) == word.charAt(j)) {
                j++;
            }

            uniq = uniq.substring(0, j);

            if (uniq.isEmpty()) {
                return "";
            }
        }

        return uniq;
    }
}