
class Solution {
    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty())   return "";
        StringBuilder bu = new StringBuilder();
        for(String i: strs){
            bu.append(i).append("\uD842");
        }
        return bu.toString();
    }

    public List<String> decode(String str) {
        if(str == null || str.isEmpty()) return new ArrayList<String>();
        String[] res = str.split("\uD842",-1);
        ArrayList<String> re = new ArrayList<>( Arrays.asList(res));
        re.remove(re.size()-1);
        return re;
    }
}