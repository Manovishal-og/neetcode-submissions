
class Solution {
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str).append("\u00A1");
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        
        String[] res = str.split("\u00A1", -1);
        
        List<String> list = new ArrayList<>(Arrays.asList(res));
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        
        return list;
    }
}