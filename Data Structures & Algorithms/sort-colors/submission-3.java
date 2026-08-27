class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int l = 0;
        int r = nums.length - 1;
        while(i <= r){
            if(nums[i] == 0){
                swap(nums , l , i);   
                l++;
            }
            else if(nums[i] == 2){
                swap(nums , i , r);
                r--;
                i--;
            }
            i++;
            
        }

    }
    public void swap(int nums[] , int l , int r){
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}