class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a1 = 0;
        int a2 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i : nums){

             if(a1 == i) c1++;
            else if(c1 == 0){
                a1 = i;
                c1 = 1;
            
            }
            else if(a2 == i) c2++;
            else if (c2 == 0 ){
                a2 = i;
                c2 = 1;
            }
            
            
            else{
                c1--;
                c2--;
            }
        }

            List<Integer> re = new ArrayList<>();
            c1 = 0; 
            c2 = 0;
            for(int j : nums){
                if(j == a1) c1++;
                else if(j == a2) c2++;
            }
            if(c1 > nums.length/3) re.add(a1);
            if(c2 > nums.length/3) re.add(a2);
            return re;
        

    }
}