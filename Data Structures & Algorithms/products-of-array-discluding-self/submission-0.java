class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        int prod = 1;
        pre[0] = 1;
        for(int i = 1 ; i < pre.length ; i++) 
            pre[i] = pre[i-1] * nums[i -1 ];

        suf[nums.length - 1] = 1;
        for(int i = suf.length - 2 ; i >= 0 ; i--)
            suf[i] = suf[i+1] * nums[i+1];
        
        int[] res = new int[pre.length];
        for(int i = 0 ; i < pre.length ; i++) 
            res[i] = suf[i] * pre[i];
        return res;
        
    }
}  
