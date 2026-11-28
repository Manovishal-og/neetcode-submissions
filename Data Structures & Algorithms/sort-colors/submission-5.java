class Solution {
    public void sortColors(int[] nums) {
        int l = 0 , i = 0 , r = nums.length - 1;
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
    private void swap(int[] nums , int l , int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}