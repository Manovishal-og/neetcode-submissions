class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a1 = -1;
        int a2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int i  : nums){
            if(i == a1) c1++;
            else if(i == a2) c2++;
            else if(c1 == 0 ){
                c1 = 1;
                a1 = i;
            }
            else if(c2 ==0){
                c2 = 1;
                a2 = i;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(i == a1) c1++;
            if(i == a2) c2++;
        }
        List<Integer> list = new ArrayList<>();
        if( c1 > nums.length/3) list.add(a1);
        if(c2 > nums.length/3) list.add(a2);
        return list;
    }
}