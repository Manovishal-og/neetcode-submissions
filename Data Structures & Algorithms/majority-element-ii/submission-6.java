class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a1 = 0;
        int a2 = 0;
        int v1 = 0;
        int v2 = 0;
        for(int i : nums){
            if(v1 == 0){
                a1 = i;
                v1 = 1;
            }
            else if(a1 == i) v1++;
            else if(v2 == 0){
                a2 = i;
                v2 = 1;
            }
            else if(a2 == i) v2++;
            else {
                v1--;
                v2--;
            }
        }
        v1 = 0;
        v2 = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(a1 == i) v1++;
            else if(a2 == i) v2++;
        }

        if(v1 > (nums.length / 3) ) list.add(a1);
        if( v2 > (nums.length / 3)  ) list.add(a2);
        return list;


    }
}