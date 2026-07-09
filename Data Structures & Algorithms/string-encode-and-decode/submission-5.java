
class Solution {
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s).append("\u2764");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        String[] res = str.split("\u2764", -1);
        ArrayList<String> st = new ArrayList<>(Arrays.asList(res));
        st.remove( st.size() - 1);
        return st;

    }
}