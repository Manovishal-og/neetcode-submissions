class Solution {
    public int maxArea(int[] heights) {
        int l = 0 ; 
        int e = heights.length - 1;
        int max = 0 ;
        int prd = 1;
        while(l < e){
            int h1 = Math.min(heights[l] , heights[e]);
            int h2 =  e - l ;
            prd = h1 * h2;
            max = Math.max(prd , max);
            if(heights[l] > heights[e]) e--;
            else l++;
        }
        return max;
    }
}
