class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0 ; 
        int c = 0;
        int r = people.length - 1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                c++;
                l++;
                r--;
            }
            else{
                if(people[r] <= limit){
                    r--;
                    c++;
                }
            }
        }
        return c;
    }
}