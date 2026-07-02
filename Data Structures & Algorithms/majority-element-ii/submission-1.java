class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a1 = 0;
        int a2 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i : nums){
            if(a1 == i) c1++;
            else if(a2 == i) c2++;
            else if(c1 == 0){
                a1 = i;
                c1 = 1;
            }
            else if(c2 == 0){
                a2 = i;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(a1 == i) c1++;
            if(a2 == i) c2++;
        }

        List<Integer> res = new ArrayList<>();
        if(c1 > nums.length/3) res.add(a1);
        if(c2 > nums.length/3) res.add(a2);
        return res;

    }
}